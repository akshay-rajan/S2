// 3. Create a class 'Person' with data members Name, Gender, Address, Age and a constructor to initialize the data members and another class 'Employee' that inherits the properties of class Person and also contains its own data members like Empid, Company_name, Qualification, Salary and its own constructor. Create another class 'Teacher' that inherits the properties of class Employee and contains its own data members like Subject, Department, Teacherid and also contain constructors and methods to display the data members. Use array of objects to display details of N teachers.


import java.util.Scanner;

public class Teacher2 {
    
    public static void main(String[] args) {

        // Store some teachers in an array
        Teacher t1 = new Teacher("John Doe", "Male", "123 Main St", 35, 1001, "ABC School", "Masters", 5000, 1, "Math", "Science");
        Teacher t2 = new Teacher("Jane Smith", "Female", "456 Elm St", 40, 1002, "XYZ School", "PhD", 6000, 2, "English", "Arts");
        Teacher t3 = new Teacher("Mike Johnson", "Male", "789 Oak St", 30, 1003, "DEF School", "B Sc.", 4000, 3, "Science", "Math");
        Teacher t4 = new Teacher("Emily Davis", "Female", "321 Pine St", 45, 1004, "GHI School", "Masters", 5500, 4, "History", "Social Studies");
        Teacher t5 = new Teacher("David Wilson", "Male", "654 Cedar St", 38, 1005, "JKL School", "PhD", 7000, 5, "Physics", "Chemistry");

        Teacher[] teachers = {t1, t2, t3, t4, t5};        
        
        // Display the teachers
        System.out.println("Name\t\tGender\tAddress\t\tAge\tEmpId\tCompany_name\tQualification\tSalary\tTeacherId\tSubject\tDepartment");
        for (Teacher tr: teachers)
            System.out.println(tr);
        
    }

}

class Person {

    String Name;
    String Gender;
    String Address;
    int Age;

    Person(String Name, String Gender, String Address, int Age) {
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.Age = Age;
    }

    // Read a person
    public static Person readPerson(Scanner sc) {
        System.out.print("Name: ");
        String Name = sc.nextLine();

        System.out.print("Gender: ");
        String Gender = sc.nextLine();

        System.out.print("Address: ");
        String Address = sc.nextLine();
        
        System.out.print("Age: ");
        int Age = sc.nextInt();
        sc.nextLine();
        return new Person(Name, Gender, Address, Age);
    }    

    // String Representation
    public String toString() {
        return this.Name + "\t" + this.Gender + "\t" + this.Address + "\t" + this.Age;
    }

}

class Employee extends Person {
    
    int EmpId;
    String Company_name;
    String Qualification;
    int Salary;

    // Inherited Constructor
    Employee(String Name, String Gender, String Address, int Age, int EmpId, String Company_name, String Qualification, int Salary) {
        super(Name, Gender, Address, Age);
        this.EmpId = EmpId;
        this.Company_name = Company_name;
        this.Qualification = Qualification;
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + this.EmpId + "\t" + this.Company_name + "\t" + this.Qualification + "\t\t" + this.Salary;
    }

}

class Teacher extends Employee {

    int TeacherId;
    String Subject;
    String Department;

    // Inherited Constructor
    Teacher(String Name, String Gender, String Address, int Age, int EmpId, String Company_name, String Qualification, int Salary, int TeacherId, String Subject, String Department) {
        super(Name, Gender, Address, Age, EmpId, Company_name, Qualification, Salary);
        this.TeacherId = TeacherId;
        this.Department = Department;
        this.Subject = Subject;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + this.TeacherId + "\t\t" + this.Subject + "\t" + this.Department;
    }

}

