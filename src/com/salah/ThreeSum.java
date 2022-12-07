package com.salah;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
            int j = i+1, k = nums.length -1, n1 = nums[i];
            while(j < k){
                int sum = nums[j] + nums[k];
                if(sum == -nums[i]) {
                    int n2 = nums[j], n3 = nums[k];
                    mainList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j<k && n2==nums[j])
                        j++;
                    while(j<k && n3==nums[k])
                        k--;
                }
                else if(sum < -nums[i]) j++;
                else k--;
            }
            while (i<nums.length-2 && n1==nums[i+1])
                i++;
        }

        return mainList;
    }

    //  Using Hash table but slower
    //    public List<List<Integer>> threeSum(int[] nums) {
    //        Set<List<Integer>> mainList = new HashSet<>();
    //        Arrays.sort(nums);
    //
    //        for(int i = 0; i < nums.length-2; i++){
    //            int j = i+1, k = nums.length -1;
    //            while(j < k){
    //                int sum = nums[j] + nums[k];
    //                if(sum == -nums[i]) {
    //                    mainList.add(Arrays.asList(nums[i], nums[j], nums[k]));
    //                    j++;
    //                    k--;
    //                }
    //                else if(sum < -nums[i]) j++;
    //                else k--;
    //            }
    //        }
    //
    //        return new ArrayList<>(mainList);
    //    }
}
