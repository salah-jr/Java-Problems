package com.salah;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{19, 10, 17, 10, 9, 8, 7, 15, 17, 30, 20, 19, 35, 35};

        FindArrayDublicates obj = new FindArrayDublicates(array);
        obj.result();

    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}
