package Session14.SMS;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

abstract class Student {
    public static int idGenerator;
    private String fistname;
    private String lastname;
    private String major;
    private int age;

    public Student(String fistname, String lastname, String major, int age) {
        this.fistname = fistname;
        this.lastname = lastname;
        this.major = major;
        this.age = age;
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

    public abstract void displayInfo();

    public  void editDetails() {
        System.out.println("The student" + getFistname() +" "+ getLastname());
    }

    @Override
    public String toString() {
        return String.format("First Name: %s, Last Name: %s", fistname, lastname);
    }

}