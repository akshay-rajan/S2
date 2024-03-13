CREATE DEFINER=`root`@`localhost` PROCEDURE `parity`(IN x INT)
BEGIN
	DECLARE op VARCHAR(10);
    IF x % 2 = 0
    THEN SET op = "even";
    ELSE SET op = "odd";
    END IF;
    SELECT op;
END

