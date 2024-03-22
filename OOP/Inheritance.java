public class Inheritance {
    public static void main(String[] args) {
        Teacher tr = new Teacher(1, "John Doe", 15000, "Trivandrum, Kerala", "English", "Poetry");
        System.out.println(tr);
    }
}


class Employee {
    
    int EmpId;
    String Name;
    int Salary;
    String Address;

    Employee(int EmpId, String Name, int Salary, String Address) {
        this.EmpId = EmpId;
        this.Name = Name;
        this.Salary = Salary;
        this.Address = Address;
    }

    
    public String toString() {
        return "EmpId: " + this.EmpId + "\nName: " + this.Name + "\nSalary: " + this.Salary + "\nAddress: " + this.Address;
    }

}


class Teacher extends Employee {

    String Department;
    String Subjects;

    Teacher(int EmpId, String Name, int Salary, String Address, String Department, String Subjects) {
        super(EmpId, Name, Salary, Address);
        this.Department = Department;
        this.Subjects = Subjects;
    }

    public String toString() {
        return super.toString() + "\nDepartment: " + this.Department + "\nSubjects: " + this.Subjects;
    }

}
