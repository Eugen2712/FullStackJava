package Session10;

public class Validp {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length() / 2; i++) {

            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        }
//        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
//            s = s.replace("()", "").replace("[]", "").replace("{}", "");
//        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{([])}";

        System.out.println(isValid(s));
    }
}
