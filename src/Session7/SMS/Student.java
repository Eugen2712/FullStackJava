package Session7.SMS;

public class Student {
    int studentid;
    String fistname;
    String lastname;
    String major;
    int age;

    Student(int id, String fName, String lName, String major, int age){
        this.studentid = id;
        this.fistname = fName;
        this.lastname = lName;
        this.major = major;
        this.age = age;
    }
    public String toString(){
       // return "ID: " + this.studentid + ", First Name: " + this.fistname + ", Last Name: " + this.lastname ;
        return String.format("ID: %d, First Name: %s, Last Name: %s, Major: %s",
                studentid,
                fistname,
                lastname,
                major);
    }
}
