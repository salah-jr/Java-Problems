package com.salah;

public class SortColors {
    public void sortColors(int[] nums) {

        int count0 = 0, count1 = 0, count2 = 0;

        // Count zeros, ones and twos
        for (int num : nums) {
            if (num == 0) count0++;
            if (num == 1) count1++;
            if (num == 2) count2++;
        }

        // update the first (count0) elements to be zeros
        for(int i = 0; i < nums.length; i++) {
            if (i < count0) nums[i] = 0;
            else if (i < count0 + count1) nums[i] = 1;
            else nums[i] = 2;
        }

    }


// Two pointers
//
//    public void sortColors(int[] nums) {
//
//        int p1 = 0, p2 = nums.length - 1, index = 0;
//        while (index <= p2) {
//            if (nums[index] == 0) {
//                nums[index] = nums[p1];
//                nums[p1] = 0;
//                p1++;
//            }
//            if (nums[index] == 2) {
//                nums[index] = nums[p2];
//                nums[p2] = 2;
//                p2--;
//                index--;
//            }
//            index++;
//        }
//    }
}
