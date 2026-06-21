SET SERVEROUTPUT ON;

DECLARE
    CURSOR account_cursor IS
        SELECT AccountID, Balance
        FROM Accounts;

BEGIN
    FOR acc IN account_cursor LOOP
        UPDATE Accounts
        SET Balance = Balance - 100
        WHERE AccountID = acc.AccountID;

        DBMS_OUTPUT.PUT_LINE(
            'Annual fee applied to Account '
            || acc.AccountID
        );
    END LOOP;

    COMMIT;
END;
/