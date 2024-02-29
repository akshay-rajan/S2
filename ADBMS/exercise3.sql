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

DESC Section;


