SET SERVEROUTPUT ON;


BEGIN
    FOR cust IN (
        SELECT c.CustomerID, l.LoanID, l.InterestRate,
               FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) AS Age
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
    )
    LOOP
        IF cust.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = cust.LoanID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied to Customer ID: ' || cust.CustomerID
            );
        END IF;
    END LOOP;
END;
/


DECLARE
    IsVIP BOOLEAN;
BEGIN
    FOR cust IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP
        IF cust.Balance > 10000 THEN
            IsVIP := TRUE;
            DBMS_OUTPUT.PUT_LINE(
                'Customer ' || cust.CustomerID || ' marked as VIP'
            );
        END IF;
    END LOOP;
END;
/


BEGIN
    FOR loan_rec IN (
        SELECT CustomerID, LoanID, EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ' || loan_rec.LoanID ||
            ' for Customer ' || loan_rec.CustomerID ||
            ' is due within 30 days.'
        );
    END LOOP;
END;
/