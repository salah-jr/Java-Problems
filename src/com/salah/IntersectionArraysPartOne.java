package com.salah;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// No duplicates in the output array
public class IntersectionArraysPartOne {
    public static int[] intersection(int[] nums1, int[] nums2) {
        boolean[] arr = new boolean[1001];
        for (int n : nums1) {
            arr[n] = true;
        }

        int[] list = new int[Math.min(nums1.length, nums2.length)];
        int len = 0;
        for (int n : nums2) {
            if (arr[n]) {
                list[len++] = n;
                arr[n] = false;
            }
        }
        return Arrays.copyOf(list, len);
    }
}
