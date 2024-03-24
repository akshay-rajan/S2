public class Inheritance {

    public static void main(String[] args) {
        Teacher tr1 = new Teacher(1, "John Doe", 15000, "Trivandrum, Kerala", "English", "Poetry");
        Teacher tr2 = new Teacher(2, "John Doe", 15000, "Trivandrum, Kerala", "English", "Poetry");
        Teacher[] arr = {tr1, tr2};
        
        // Display the teachers
        System.out.println("EmpId\tName\t\tSalary\tAddress\t\t\tDepartment\tSubjects");
        for (Teacher tr: arr)
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
        return this.EmpId + "\t" + this.Name + "\t" + this.Salary + "\t" + this.Address;
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

    

    @Override
    public String toString() {
        return super.toString() + "\t" + this.Department + "\t\t" + this.Subjects;
    }

}
