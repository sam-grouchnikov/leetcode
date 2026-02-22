package easy;

// 1. TwoSum

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (table.get(remaining) != null) {
                return new int[]{table.get(remaining), i};
            } else{
                table.put(nums[i], i);
            }
        }
        return new int[] {0,0};
    }

    public static void main() {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}