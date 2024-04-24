// 5. Create classes Student and Sports. Create another class Result inherited from Student and Sports. Display the academic and sports score of a student.


public class Result extends Student {

    Result(String name, int AdmissionNo, int Marks) {
        super(name, AdmissionNo, Marks);
    }
    public static void main(String[] args) {
        
        Result s = new Result("Harry", 23192, 92);
        Result.Sports ss = s.new Sports(7);

        System.out.println("Result:");
        System.out.println("Academics: " + s.Marks);
        System.out.println("Sports: " + ss.Score);

    }

}

class Student {

    String Name;
    int AdmissionNo;
    int Marks;

    Student(String Name, int AdmissionNo, int Marks) {
        this.Name = Name;
        this.AdmissionNo = AdmissionNo;
        this.Marks = Marks;
    }

    class Sports {

        int Score;

        Sports(int Score) {
            this.Score = Score;
        }

    }

}
