package com.salah;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] nums = {1,1,2,2,3};
        System.out.println(5^7^8^3);
    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}
  