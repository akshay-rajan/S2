// 2. Create a class Employee' with data members Empid, Name, Salary, Address and constructors to initialize the data members. Create another class 'Teacher' that inherit the properties of class employee and contain its own data members department, Subjects taught s of class employee and and constructors to initialize these data members and also include display function to. display all the data members. Use array of objects to display details of N teachers.


import java.util.Scanner;

public class Teacher extends Employee {

    String Department;
    String Subjects;

    // Inherited Constructor
    Teacher(int EmpId, String Name, int Salary, String Address, String Department, String Subjects) {
        super(EmpId, Name, Salary, Address);
        this.Department = Department;
        this.Subjects = Subjects;
    }

    // Read a teacher from the user
    public static Teacher readTeacher(Scanner sc) {
        System.err.print("EmpId: ");
        int EmpId = sc.nextInt();
        sc.nextLine();
    
        System.out.print("Name: ");
        String Name = sc.nextLine();
    
        System.out.print("Salary: ");
        int Salary = sc.nextInt();
        sc.nextLine(); 
    
        System.out.print("Address: ");
        String Address = sc.nextLine();
    
        System.out.print("Department: ");
        String Department = sc.nextLine();
    
        System.out.print("Subjects: ");
        String Subjects = sc.nextLine();
    
        return new Teacher(EmpId, Name, Salary, Address, Department, Subjects);
    }
    

    @Override
    public String toString() {
        return super.toString() + "\t" + this.Department + "\t\t" + this.Subjects;
    }

    public static void main(String[] args) {

        // Array to store the teachers
        Teacher[] teachers;

        // Read the teachers from the user and add it to the array
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of teachers: ");
        int n = sc.nextInt();
        teachers = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.println("---------------- Teacher " + (i + 1) + "----------------");
            teachers[i] = Teacher.readTeacher(sc);            
        }
        
        // Display the teachers
        System.out.println("EmpId\tName\tSalary\tAddress\tDepartment\tSubjects");
        for (Teacher tr: teachers)
            System.out.println(tr);
    }

}


class Employee {
    
    int EmpId;
    String Name;
    int Salary;
    String Address;

    // Constructor
    Employee(int EmpId, String Name, int Salary, String Address) {
        this.EmpId = EmpId;
        this.Name = Name;
        this.Salary = Salary;
        this.Address = Address;
    }

    // String Representation
    public String toString() {
        return this.EmpId + "\t" + this.Name + "\t" + this.Salary + "\t" + this.Address;
    }

}


