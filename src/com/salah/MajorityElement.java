package com.salah;

import java.util.Arrays;

public class MajorityElement {


    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    //Hash table
    // public int majorityElement(int[] nums) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for(int num : nums){
    //         if(map.containsKey(num)){
    //             int count = map.get(num) + 1;
    //             if(count > nums.length / 2) return num;
    //             map.put(num, count);
    //         }
    //         else map.put(num, 1);
    //     }

    //     return nums[0];
    // }

    // Moore voting algorithm
    // public int majorityElement(int[] nums) {
    //     int count=0, ret = 0;
    //     for (int num: nums) {
    //         if (count==0)
    //             ret = num;
    //         if (num!=ret)
    //             count--;
    //         else
    //             count++;
    //     }
    //     return ret;
    // }
}
