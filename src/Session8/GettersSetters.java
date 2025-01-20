package Session8;

public class GettersSetters {
    public static void main(String[] args) {
       Person p = new Person();
//       p.fistName = "John";
//       p.lastName = "Doe";
//       System.out.println(p.fistName + " " + p.lastName);
        p.setFistName("John");
        System.out.println(p.getFistName());
    }
}

class Person {
    private String fistName;
    private String lastName;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative");
        } else {
            this.age = age;
        }
    }
    public String getFistName() {
        return fistName;
    }
    public void setFistName(String fistName) {
        if (fistName == "") {
            System.out.println("First name cannot be empty");
        }else {
            this.fistName = fistName;
        }
    }
}