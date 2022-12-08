package com.salah;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String s = "S df B :";
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(result);
        Set<Integer> set = new HashSet<>();
        Object[] arr = new Object[set.size()];
        arr = set.toArray();
    }

}