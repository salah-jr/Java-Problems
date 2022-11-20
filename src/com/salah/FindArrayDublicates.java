package com.salah;


import java.util.HashSet;

public class FindArrayDublicates {

    public void FindArrayDublicates(int[] array){
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

}
