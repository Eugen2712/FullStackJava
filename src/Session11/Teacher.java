package Session11;

public class Teacher extends  Person{
    String  subject;
    public void teach() {
        System.out.println("I am teaching");
    }

    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + super.name + " and I am a teacher.");
    }
}
