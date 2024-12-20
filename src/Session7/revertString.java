package Session7;

public class revertString {
    public static void main(String[] args) {
    System.out.println(reverse("Hello"));

    }
    static String reverse(String original) {
        String result = "";
        for ( int i = original.length()-1; i>=0; i--){
          result = result + original.charAt(i);
        }
        return result;
    }
}
