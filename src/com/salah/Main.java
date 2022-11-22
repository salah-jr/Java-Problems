package com.salah;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println( Integer.MAX_VALUE);
    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}
  