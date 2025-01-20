package Session11;

public class ExtendsKeyword {

    public static void main(String[] args) {
    Person p = new Person();
    p.name = "John";
    p.age = 20;
    p.introduce();

    Student s = new Student();
    s.name = "Alice";
    s.age = 18;
    s.studentID ="123";
    s.introduce();
    s.study();
    }
}
