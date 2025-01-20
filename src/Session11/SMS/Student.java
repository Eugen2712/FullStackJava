package Session11.SMS;

public class Student {
    public static int idGenerator;

    private String fistname;
    private String lastname;
    private String major;
    private int age;

    public Student() {
        idGenerator++;
    }

    public Student(String fName, String lName, String major, int age) {
        setFistname(fName);
        setLastname(lName);
        setMajor(major);
        setAge(age);
        idGenerator++;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMajor(String major) {
        if (!(major.equals("Art") || major.equals("Economics") || major.equals("It"))) {
            throw new IllegalArgumentException("Invalid major");
        } else {
            this.major = major;
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 150) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age");
        }
    }

    public String getFistname() {
        return fistname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMajor() {
        return major;
    }

    public int getAge() {
        return age;
    }

    public int getIdGenerator() {
        return idGenerator;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s, Last Name: %s", fistname, lastname);
    }
}