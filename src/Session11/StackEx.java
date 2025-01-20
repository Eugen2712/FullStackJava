package Session11;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Character> chars = new Stack<>();
        chars.push('{');
        chars.push('[');
        chars.push('}');
        System.out.println(chars);
        chars.pop();
        System.out.println(chars);
    }
}
