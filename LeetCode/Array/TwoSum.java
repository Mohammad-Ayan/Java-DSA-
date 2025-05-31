package LeetCode.Array;

import java.util.HashMap;

public class TwoSum {
   public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>(); // value -> index

    for (int i = 0; i < nums.length; i++) {
        int required = target - nums[i]; // the number we need

        if (map.containsKey(required)) {
            return new int[] { map.get(required), i };
        }

        map.put(nums[i], i); // store current number with its index
    }

    return new int[] {}; // if no pair found
}

}
