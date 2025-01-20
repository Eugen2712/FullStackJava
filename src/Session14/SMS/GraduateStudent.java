package Session14.SMS;

public class GraduateStudent extends Student implements details{
    private double GPA;
    public GraduateStudent(String fName, String lName, String major, int age, double GPA) {
        super(fName, lName, major, age);
        this.GPA = GPA;
    }

    @Override
    public void displayInfo() {
        System.out.printf("| %-20s | %-20s | %-10s | %-5d | %-11d | %-5.2f\n",
                getFistname(),
                getLastname(),
                getMajor(),
                getAge(),
                getIdGenerator(),
                GPA);
        System.out.println("-------------------------------------------------------------------------------------------");
//        }
//    }
    }

    @Override
    public  void editDetails() {
        System.out.println("The student" + getFistname() +" "+ getLastname()+ " graduate!");
    }

    public void setGPA(double v) {
        this.GPA = v;
    }
}
