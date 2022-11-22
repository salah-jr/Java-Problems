package com.salah;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Allowing duplicates in the output array
public class IntersectionArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0;
        int p2 = 0;
        List<Integer> result = new ArrayList<>();

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                result.add(nums1[p1]);
                p1 ++;
                p2 ++;
            }
            else if (nums1[p1] < nums2[p2]) {
                p1 ++;
            }
            else if (nums1[p1] > nums2[p2]) {
                p2 ++;
            }
        }

        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }
        return output;
    }
}
