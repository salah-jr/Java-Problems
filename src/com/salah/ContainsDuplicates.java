package com.salah;

import java.util.HashSet;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        int i = 0;
        while(i < nums.length){
            if(hash.contains(nums[i])){
                return true;
            }
            hash.add(nums[i]);
            i++;
        }
        return false;
    }
}
