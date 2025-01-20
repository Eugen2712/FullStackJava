package Session15;

import java.util.*;

class Student {
    private  int Id;
    private String name;
    private int age;
    private double gpa;

    public Student(int Id, String name, int age, double gpa) {
        this.Id = Id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public int getId() {
        return Id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGpa() {
        return gpa;
    }
}
class NameCompareAscending implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        int result = 0;
        String name1 = s1.getName();
        String name2 = s2.getName();
        result = name1.compareTo(name2);
        return result;
        //return s1.getName().compareTo(s2.getName());
    }
}
class NameCompareDesc implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.getName().compareTo(s1.getName());
    }
}
class GradeComparaAscending implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGpa(), s2.getGpa());
    }
}
public class StudentCompare {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Zara", 20, 3.5));
        students.add(new Student(2, "Alice", 22, 3.8));
        students.add(new Student(3, "Bob", 21, 3.6));


        Collections.sort(students, new NameCompareAscending());
        for (Student s : students) {
            System.out.println(s.getName());
        }
        Collections.sort(students, new NameCompareDesc());
        for (Student s : students) {
            System.out.println(s.getName());
        }
        Collections.sort(students, new GradeComparaAscending());
        for (Student s : students) {
            System.out.println(s.getName() + " grade " + s.getGpa());
        }
    }
    }
