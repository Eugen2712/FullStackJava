package Session16;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private double gpa;

    public Student(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return  "id=" + id + ", name=" + name ;
    }
    public String toCSV() {
        return id + "," + name + "," + age + "," + gpa;
    }
    public static Student fromCSV(String csvLine) {
       String[] parts = csvLine.split(",");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        int age = Integer.parseInt(parts[2]);
        double gpa = Double.parseDouble(parts[3]);
        return new Student(id, name, age, gpa);

    }
}
