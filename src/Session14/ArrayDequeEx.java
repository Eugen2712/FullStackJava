package Session14;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Task> tasks = new ArrayDeque<>();
        tasks.addLast(new Task("Simple task 1", 3));
        tasks.addLast(new Task("Simple task 2", 5));
        tasks.addLast(new Task("Simple task 3", 4));
        tasks.addLast(new Task("Simple task 4", 1));

        tasks.forEach(System.out::println);
        System.out.println("====================================");
        while (!tasks.isEmpty()) {
            Task t = tasks.pollFirst();
            System.out.println(t.toString());
        }
    }
}
