# SQL

Structured Query Language is used to access and manipulate databases.

Relational Database Management System is the basis for SQL. The data in RDBMS is stored in **Tables**. A Table consists of rows - **Tuples / Records** and Columns - **Attributes**.

SQL keywords are not case sensitive.

### Data Definition Language (DDL):

1. **CREATE DATABASE**: Creates a new database.

        CREATE DATABASE databasename;

2. **DROP DATABASE**: Delete an existing database.

        DROP DATABASE databasename;

3. **CREATE TABLE**: Creates a new table.

        CREATE TABLE table_name (
                column1 datatype,
                column2 datatype,
                column3 datatype,
                ....
        );

4. **DROP TABLE**: Delete an existing table.

        DROP TABLE tablename;

5. **TRUNCATE TABLE**: Delete the data inside the table and not the table itself.

        TRUNCATE TABLE tablename;

6. **ALTER TABLE**: Modifies an existing table's structure.

    i. **ADD COLUMN**

                ALTER TABLE tablename
                ADD COLUMN columnname datatype;

    ii. **DROP COLUMN**

                ALTER TABLE tablename
                DROP COLUMN columnname;

    iii. **RENAME COLUMN**

                ALTER TABLE tablename
                RENAME COLUMN oldname TO newname;
                
    iv. **Modify Datatype**

                ALTER TABLE tablename
                MODIFY COLUMN columnname datatype;
                
7. **CONSTRAINTS**

   **On Creation**:

        CREATE TABLE table_name (
                column1 datatype constraint,
                column2 datatype constraint,
                ....
        );
   **After Creation**:

        ALTER TABLE table_name
        ADD CONSTRAINT constr_name constraint (col1,col2,...);

    i. **NOT NULL**:

        CREATE TABLE Persons (
                ID int NOT NULL,
                LastName varchar(255) NOT NULL,
                FirstName varchar(255) NOT NULL,
                Age int
        );

        --OR

        ALTER TABLE Persons
        MODIFY COLUMN Age int NOT NULL;
    
    ii. **UNIQUE**:

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

    iii. **PRIMARY KEY**:

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
        
    iv. **FOREIGN KEY**:

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

    v. **CHECK**:

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

    vi. **DEFAULT**:

        CREATE TABLE Orders (
                ID int NOT NULL,
                OrderNumber int NOT NULL,
                OrderDate date DEFAULT GETDATE()
        );

        --OR

        ALTER TABLE Persons
        ALTER City SET DEFAULT 'Sandnes';

8. **CREATE INDEX**: Creates an index on a table.

        CREATE INDEX idx_lastname 
        ON Employees(LastName);

9. **AUTOINCREMENT**: Allows a unique number to be generated automatically at a field.

        CREATE TABLE Persons (
                Personid int NOT NULL AUTO_INCREMENT,
                LastName varchar(255) NOT NULL,
                FirstName varchar(255),
                Age int,
                PRIMARY KEY (Personid)
        );

10. **CREATE VIEW**: Creates a virtual table.

        CREATE VIEW view_name AS
        SELECT column1, column2, ...
        FROM table_name
        WHERE condition;

### Data Manipulation Language (DML):

1. **SELECT**: Retrieves data from one or more tables.

        SELECT * FROM Employees 
        WHERE DepartmentID = 100;


2. **INSERT INTO**: Adds new records to a table.

        INSERT INTO Employees (EmployeeID, FirstName, LastName, DepartmentID) 
        VALUES (1, 'John', 'Doe', 100);

3. **UPDATE**: Modifies existing records in a table.

        UPDATE Employees SET DepartmentID = 200 
        WHERE EmployeeID = 1;

4. **DELETE**: Removes records from a table.

        DELETE FROM Employees WHERE EmployeeID = 1;
