package Session16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class SaveCsvEx {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "John", 20, 3.5));
        saveStudentCSV(studentList);

        for (Student s : loadStudents()) {
            System.out.println(s);
        }
    }

    public static void saveStudentCSV(List<Student> students) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv"))) {
            for (Student s : students) {
                bw.write(s.toCSV());
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Student> loadStudents() {
        List<Student> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                //result.add();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
