package com.salah;

public class Main {

    public static void main(String[] args) {
        String s = "S df B :";
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(result);
    }

}
  