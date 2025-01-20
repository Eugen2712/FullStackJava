package Session15;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class Person{
    String name;
    int[] scores;

    public Person(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }
    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return (double) sum / scores.length;
    }
}
public class loghinEx {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", new int[]{90, 80, 70}));
        persons.add(new Person("Bob", new int[]{90, 70, 30}));
        persons.add(null);
        persons.add(new Person("Charlie", new int[]{90, 82, 70}));

        for (Person p : persons) {
            try {
                double avg = p.getAverage();
                System.out.println(p.name + " has an average of " + avg);
            } catch (Exception e){
                log("Error: " + e.getMessage());
            }
        }
    }
    public  static void log(String message) {
        try(FileWriter fw = new FileWriter("log.txt", true);
          PrintWriter pw = new PrintWriter(fw)){
            pw.println("[MESSAGE]" + message);
        } catch (Exception e) {
            System.out.println("Failed");
        }
    }
}
