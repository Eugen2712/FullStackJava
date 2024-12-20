package Session7;

public class MaxnrArray {
    public static void main(String[] args) {
        int[] input = {4,3,5,8,112,1,39};
        int max = 0;
        for( int i = 0; i<=input.length-1; i++){
            if (  input[i]>max){
                max = input[i];
            }
        }
        System.out.println(max);
    }
}
