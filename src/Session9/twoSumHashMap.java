package Session9;

import java.util.HashMap;
import java.util.Map;

public class twoSumHashMap {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2,2,6,4,5,7,8,1};
        int target = 13;
        int[] result1 = twoSum(nums, target);
        System.out.println(result1[0] + " " + result1[1]);
    }
}
