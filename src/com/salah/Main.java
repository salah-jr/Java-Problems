package com.salah;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{19, 10, 17, 10, 9, 8, 7, 15, 17, 30, 20, 19, 35, 35};
        int[] sortedArray = new int[]{1,5,6,7,9,11,14,15,19,20};

        MySqrt obj = new MySqrt();
        System.out.println(obj.mySqrt(10));
    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}
