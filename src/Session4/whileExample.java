package Session4;

public class whileExample {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        while (count < 10) {
            System.out.println("thi is an infinite loop");
            Thread.sleep(1000);
            count++;
        }
    }
}
