package com.salah;


import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        System.out.println(RemoveElement.removeElement(nums, 2));
    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}
