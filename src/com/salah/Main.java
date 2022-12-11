package com.salah;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.getOrDefault(0, 1);
    }

}