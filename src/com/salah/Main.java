package com.salah;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int [][] arr = new int[4][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[2][0] = 2;
        arr[2][1] = 5;
        arr[3][0] = 5;
        arr[3][1] = 7;
        System.out.println(Arrays.deepToString(arr));
        Arrays.sort(arr, (a,b) -> (a[0] - b[0]));
        System.out.println(Arrays.deepToString(arr));

    }

}