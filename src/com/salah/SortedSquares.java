package com.salah;

public class SortedSquares {

    public int[] sortedSquares(int[] nums) {
        int r = nums.length-1;
        int l = 0;
        int res[] = new int[r + 1];
        int i = r;
        while(l <= r){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                res[i] = nums[l] * nums[l];
                l++;
            } else{
                res[i] = nums[r] * nums[r];
                r--;
            }

            i--;
        }
        return res;
    }

}
