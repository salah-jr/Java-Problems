package com.salah;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int sum=0;
        for (int num : nums) {
            sum = sum ^ num;
        }
        return sum;
    }
}
