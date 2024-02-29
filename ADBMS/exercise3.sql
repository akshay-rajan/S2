-- 01 
CREATE DATABASE University;
USE University;

CREATE TABLE Student (
	name VARCHAR(50),
    student_number INT PRIMARY KEY,
    class INT,
    major VARCHAR(50)
);

CREATE TABLE Course (
	course_name VARCHAR(50),
    course_number VARCHAR(50) PRIMARY KEY,
    credit_hours INT,
    department VARCHAR(50)
);

CREATE TABLE Section (
	section_identifier INT PRIMARY KEY,
    course_number VARCHAR(50),
    semester VARCHAR(50),
    year YEAR,
    instructor VARCHAR(50),
    FOREIGN KEY (course_number) REFERENCES Course(course_number)
);

CREATE TABLE Grade_report (
	student_number INT,
    section_identifier INT,
    grade VARCHAR(10),
    PRIMARY KEY (student_number, section_identifier),
    FOREIGN KEY (student_number) REFERENCES Student(student_number),
    FOREIGN KEY (section_identifier) REFERENCES Section(section_identifier)
);

CREATE TABLE Prerequisite (
	course_number VARCHAR(50),
    prerequisite_number VARCHAR(50),
    PRIMARY KEY (course_number, prerequisite_number),
    FOREIGN KEY (course_number) REFERENCES Course(course_number),
    FOREIGN KEY (prerequisite_number) REFERENCES Course(course_number)
);

-- 02

INSERT INTO Student VALUES ("Smith",17,1,"CS");
INSERT INTO Student VALUES ("Brown",8,2,"CS");

INSERT INTO Course VALUES ("intro to computer science","CS1310",4,"CS");
INSERT INTO Course VALUES ("Data structure","CS3320",4,"CS");
INSERT INTO Course VALUES ("Discrete Mathematics","MATH2410",3,"MATH");
INSERT INTO Course VALUES ("Database","CS3380",3,"CS");

INSERT INTO Section VALUES (85,"MATH2410","Fall",07,"King");
INSERT INTO Section VALUES (92,"CS1310","Fall",07,"Anderson");
INSERT INTO Section VALUES (102,"CS3320","Spring",08,"Knuth");
INSERT INTO Section VALUES (112,"MATH2410","Fall",08,"Chang");
INSERT INTO Section VALUES (119,"CS1310","Fall",08,"Anderson");
INSERT INTO Section VALUES (135,"CS3380","Fall",08,"Stone");


INSERT INTO grade_report VALUES (17,112,"B");
INSERT INTO grade_report VALUES (17,119,"C");
INSERT INTO grade_report VALUES (8,85,"A");
INSERT INTO grade_report VALUES (8,92,"A");
INSERT INTO grade_report VALUES (8,102,"B");
INSERT INTO grade_report VALUES (8,135,"A");

INSERT INTO prerequisite VALUES ("CS3380","CS3320");
INSERT INTO prerequisite VALUES ("CS3380","MATH2410");
INSERT INTO prerequisite VALUES ("CS3320","CS1310");


DESC Section;


