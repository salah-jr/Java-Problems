package com.salah;

public class Search2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        while(i < matrix.length){
            if(binarySearch(matrix[i],target)){
                return true;
            }
            i++;
        }

        return false;
    }

    static boolean binarySearch(int nums[], int target){
        int pivot, left = 0, right = nums.length - 1;

        while (left <= right) {
            pivot = (right + left) / 2;

            if (nums[pivot] == target) return true;

            if (target < nums[pivot]) right = pivot - 1;

            else left = pivot + 1;
        }
        return false;
    }
}
