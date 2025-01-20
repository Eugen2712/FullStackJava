package Session16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClasstoFileEx {
    public static void main(String[] args) {
//        Student s = new Student(1, "John", 20, 3.5);
//        saveToFile(s);
        Student s = loadStudent();
        System.out.println(s);
    }
    public static void saveToFile(Student student) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    public static Student loadStudent() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            return (Student) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }
}
