DECLARE
    num NUMBER := 10;
BEGIN
    IF num > 0 THEN
        DBMS_OUTPUT.PUT_LINE('Positive Number');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Non-Positive Number');
    END IF;
END;
/