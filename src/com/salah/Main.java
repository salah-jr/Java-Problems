package com.salah;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        String s = "()";
        int p1 = 0, p2 = s.length()-1;
        char [] array = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        System.out.println(array[p1] == array[p2]);

    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}
  