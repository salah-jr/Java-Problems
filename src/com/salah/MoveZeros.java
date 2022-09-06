package com.salah;

public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int r=0;
        for(int l=0; l<nums.length; l++)
        {
            if(nums[l] != 0) {
                reverse(nums, l, r);
                r++;
            }
        }
    }

    public void reverse(int[] nums, int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

}
