package com.salah;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];
        int[] left = new int[size];
        int[] right = new int[size];
        left[0] = 1;
        right[size - 1] = 1;

        for (int i = 1; i < size; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        for (int i = size - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }

        for (int i = 0; i < size; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }

// Without extra space more than the answer array
//    public int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int[] answer = new int[n];
//        answer[0] = 1;
//
//        for (int i = 1; i < n; i++) {
//            answer[i] = nums[i-1] * answer[i-1];
//        }
//
//        int r = 1;
//        for (int i = n - 1; i >= 0; i--) {
//            answer[i] *= r;
//            r *= nums[i];
//        }
//
//        return answer;
//    }
}

