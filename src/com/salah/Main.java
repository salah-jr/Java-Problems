package com.salah;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[] { 10, 17, 17, 9, 8, 7, 15, 30, 20, 19, 19, 35, 35 };

        HashSet<Integer> hash = new HashSet<>();

        int i = 0;
        StringBuilder output = new StringBuilder();

        while (i <= array.length - 1) {
            if (hash.contains(array[i])) {
                output.append(array[i]).append(" ");
            }

            hash.add(array[i]);
            i++;
        }

        System.out.println("The duplicates numbers are : " + output);

    }

    // private static void swap(int[] array, int j, int i) {
    // int temp = array[j];
    // array[j] = array[i];
    // array[i] = temp;
    // }

}
