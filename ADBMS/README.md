# SQL

Structured Query Language is used to access and manipulate databases.

Relational Database Management System is the basis for SQL. The data in RDBMS is stored in **Tables**. A Table consists of rows - **Tuples** and Columns - **Attributes**.

SQL keywords are not case sensitive.

### Data Definition Language (DDL):

Sure, here's your provided SQL queries with syntax highlighting:

1. **CREATE DATABASE**: Creates a new database.

```sql
CREATE DATABASE databasename;
```

2. **DROP DATABASE**: Delete an existing database.

```sql
DROP DATABASE databasename;
```

3. **CREATE TABLE**: Creates a new table.

```sql
CREATE TABLE table_name (
        column1 datatype,
        column2 datatype,
        column3 datatype,
        ....
);
```

4. **DROP TABLE**: Delete an existing table.

```sql
DROP TABLE tablename;
```

5. **TRUNCATE TABLE**: Delete the data inside the table and not the table itself.

```sql
TRUNCATE TABLE tablename;
```

6. **ALTER TABLE**: Modifies an existing table's structure.

 **ADD COLUMN**

```sql
ALTER TABLE tablename
ADD COLUMN columnname datatype;
```

**DROP COLUMN**

```sql
ALTER TABLE tablename
DROP COLUMN columnname;
```

**RENAME COLUMN**

```sql
ALTER TABLE tablename
RENAME COLUMN oldname TO newname;
```

**Modify Datatype**

```sql
ALTER TABLE tablename
MODIFY COLUMN columnname datatype;
```

7. **CONSTRAINTS**

**On Creation**:

```sql
CREATE TABLE table_name (
        column1 datatype constraint,
        column2 datatype constraint,
        ....
);
```

   **After Creation**:

```sql
ALTER TABLE table_name
ADD CONSTRAINT constr_name constraint (col1,col2,...);
```

i. **NOT NULL**:

```sql
CREATE TABLE Persons (
        ID int NOT NULL,
        LastName varchar(255) NOT NULL,
        FirstName varchar(255) NOT NULL,
        Age int
);

--OR

ALTER TABLE Persons
MODIFY COLUMN Age int NOT NULL;
```

ii. **UNIQUE**:

```sql
CREATE TABLE Persons (
        ID int NOT NULL,
        LastName varchar(255) NOT NULL,
        FirstName varchar(255),
        Age int,
        UNIQUE (ID)
);

--OR

ALTER TABLE Persons
ADD UNIQUE (ID);
```

iii. **PRIMARY KEY**:

```sql
CREATE TABLE Persons (
        ID int NOT NULL,
        LastName varchar(255) NOT NULL,
        FirstName varchar(255),
        Age int,
        PRIMARY KEY (ID)
);

--OR

ALTER TABLE Persons
ADD PRIMARY KEY (ID);
```

iv. **FOREIGN KEY**:

```sql
CREATE TABLE Orders (
        OrderID int NOT NULL,
        OrderNumber int NOT NULL,
        PersonID int,
        PRIMARY KEY (OrderID),
        FOREIGN KEY (PersonID) REFERENCES Persons(PersonID)
);

--OR

ALTER TABLE Orders
ADD FOREIGN KEY (PersonID) REFERENCES Persons(PersonID);
```

v. **CHECK**:

```sql
CREATE TABLE Persons (
        ID int NOT NULL,
        LastName varchar(255) NOT NULL,
        FirstName varchar(255),
        Age int,
        CHECK (Age>=18)
);

--OR

ALTER TABLE Persons
ADD CHECK (Age>=18);
```

vi. **DEFAULT**:

```sql
CREATE TABLE Orders (
        ID int NOT NULL,
        OrderNumber int NOT NULL,
        OrderDate date DEFAULT GETDATE()
);

--OR

ALTER TABLE Persons
ALTER City SET DEFAULT 'Sandnes';
```

8. **CREATE INDEX**: Creates an index on a table.

```sql
CREATE INDEX idx_lastname 
ON Employees(LastName);
```

9. **AUTOINCREMENT**: Allows a unique number to be generated automatically at a field.

```sql
CREATE TABLE Persons (
        Personid int NOT NULL AUTO_INCREMENT,
        LastName varchar(255) NOT NULL,
        FirstName varchar(255),
        Age int,
        PRIMARY KEY (Personid)
);
```

10. **CREATE VIEW**: Creates a virtual table.

```sql
CREATE VIEW view_name AS
SELECT column1, column2, ...
FROM table_name
WHERE condition;
```### Data Manipulation Language (DML):

1. **SELECT**: Retrieves data from one or more tables.

```sql
SELECT * FROM Employees 
WHERE DepartmentID = 100;
```

2. **INSERT INTO**: Adds new records to a table.
```sql
INSERT INTO Employees (EmployeeID, FirstName, LastName, DepartmentID) 
VALUES (1, 'John', 'Doe', 100);
```

3. **UPDATE**: Modifies existing records in a table.
```sql
UPDATE Employees SET DepartmentID = 200 
WHERE EmployeeID = 1;
```
4. **DELETE**: Removes records from a table.
```sql
DELETE FROM Employees WHERE EmployeeID = 1;
```

## PL/SQL

PL/SQL (Procedural Language/Structured Query Language) is a programming language used for developing applications within Oracle databases. 
It extends SQL (Structured Query Language) by adding procedural capabilities, allowing developers to write procedural code such as loops, conditional statements, and error handling directly within SQL blocks. PL/SQL is commonly used to create stored procedures, functions, triggers, and packages, which enhance the functionality and performance of Oracle database applications.

### 1. Declare a Variable

```sql
my_variable VARCHAR(50);
```

### 2. Create a Simple Loop

```sql
FOR i IN 1..5 LOOP
        ...
END LOOP;
```
```sql
WHILE counter <= 5 LOOP
        ...
END LOOP;
```

### 3. Create a Conditional Statement

```sql
DECLARE
    x NUMBER := 10;
BEGIN
    IF x > 5 THEN
        DBMS_OUTPUT.PUT_LINE('x is greater than 5');
    ELSE
        DBMS_OUTPUT.PUT_LINE('x is not greater than 5');
    END IF;
END;
```

### 4. Create a Function

```sql
CREATE OR REPLACE FUNCTION calculate_area(length IN NUMBER, width IN NUMBER)
RETURN NUMBER
IS
    area NUMBER;
BEGIN
    area := length * width;
    RETURN area;
END;
```

### 5. Create a Procedure

```sql
CREATE OR REPLACE PROCEDURE display_message(message IN VARCHAR2)
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE(message);
END;
```
