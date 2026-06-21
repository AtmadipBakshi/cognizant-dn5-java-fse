SET SERVEROUTPUT ON;


CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Monthly interest processed.');
END;
/
 

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department IN VARCHAR2,
    p_bonus_percent IN NUMBER
)
AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_percent / 100)
    WHERE Department = p_department;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Employee bonus updated.');
END;
/
 

CREATE OR REPLACE PROCEDURE TransferFunds(
    p_source_account IN NUMBER,
    p_target_account IN NUMBER,
    p_amount IN NUMBER
)
AS
    v_balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_source_account;

    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(
            -20001,
            'Insufficient Balance'
        );
    END IF;

    UPDATE Accounts
    SET Balance = Balance - p_amount
    WHERE AccountID = p_source_account;

    UPDATE Accounts
    SET Balance = Balance + p_amount
    WHERE AccountID = p_target_account;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Funds transferred successfully.');
END;
/



BEGIN
    ProcessMonthlyInterest;
END;
/

BEGIN
    UpdateEmployeeBonus('IT', 10);
END;
/

BEGIN
    TransferFunds(1, 2, 100);
END;
/