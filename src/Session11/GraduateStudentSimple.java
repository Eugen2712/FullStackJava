package Session11;

public class GraduateStudentSimple {

    static void describeStudent(Student student) {
      if (student instanceof GradueteStudent) {
        System.out.println("This is a graduate student");
      } else {
        System.out.println("This is a student");
      }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Alice";
        s.age = 18;
        s.studentID ="123";

        GradueteStudent gradueteStudent = new GradueteStudent();
        gradueteStudent.name = "Bob";
        gradueteStudent.age = 22;
        gradueteStudent.researchTopic = "AI";
        gradueteStudent.studentID = "Math";

        s.introduce();
        gradueteStudent.introduce();
        describeStudent(s);
        describeStudent(gradueteStudent);
    }



}
