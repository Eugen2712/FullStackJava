package Session14;

import java.util.HashSet;

public class Challenge {
    public static void main(String[] args) {
        int[] numbers = {1,4,6,8,22,6};

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
          Boolean added = set.add(numbers[i]);
            if (!added) {
                System.out.println("Duplicate found: " + numbers[i]);
            }
        }
    }
}
