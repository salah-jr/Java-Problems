package com.salah;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            if (h.containsKey(nums[i])) {
                return new int[]{h.get(nums[i]), i};
            }

            int remain = target - nums[i];
            h.put(remain, i);
        }

        return nums;
    }

}
