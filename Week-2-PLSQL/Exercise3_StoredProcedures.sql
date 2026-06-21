CREATE OR REPLACE PROCEDURE greet_user(
    user_name IN VARCHAR2
)
AS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Hello, ' || user_name);
END;
/

BEGIN
    greet_user('Atmadip');
END;
/