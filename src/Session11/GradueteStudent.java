package Session11;

public class GradueteStudent extends Student{
    String  researchTopic;

    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + super.name + " and I am a graduate student.");
    }
}
