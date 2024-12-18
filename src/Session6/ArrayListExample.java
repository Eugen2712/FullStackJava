package Session6;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int[] intArray = {4,3,2,5,6};
        ArrayList<Integer> intarrayList = new ArrayList<Integer>();
        intarrayList.add(43);
        intarrayList.add(12);
        System.out.println(intarrayList);
        intarrayList.add(5);
        System.out.println(intarrayList);
        intarrayList.remove(0);
        System.out.println(intarrayList);
        intarrayList.remove(Integer.valueOf(12));
        System.out.println(intarrayList);
    }
}
