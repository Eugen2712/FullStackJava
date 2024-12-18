package Sessian5;

public class ReverseArray {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 30, 40, 50};
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - i - 1];
            numbers[n - i - 1] = temp;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        }
    }

