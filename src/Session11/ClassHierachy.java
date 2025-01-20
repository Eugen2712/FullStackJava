package Session11;

public class ClassHierachy {

    public static void main(String[] args) {
        Person s = new Student();
        s.name = "Alice";

        Person t = new Teacher();
        t.name = "Bob";

     //   Person g = new GraduateStudent();
//        g.name = "Charlie";

        Person[] people = {s, t};
        for (Person p : people) {
            p.introduce();
        }
    }
}
