package Session14;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Comparator<Task> taskComparator = ( t1, t2 ) -> Integer.compare(t2.priority, t1.priority);

        PriorityQueue<Task> taskQ = new PriorityQueue<>(taskComparator);
        taskQ.add(new Task("Prepare queue topic", 3));
        taskQ.add(new Task("Sample impotant task", 1));
        taskQ.add(new Task("Team meeting", 5));
        taskQ.add(new Task("Code Review", 4));

        while (!taskQ.isEmpty()) {
            Task t = taskQ.poll();
            System.out.println(t.toString());
        }

    }
}
