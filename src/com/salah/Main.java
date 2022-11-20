package com.salah;


public class Main {

    public static void main(String[] args) {
        System.out.println(RomanToInteger.romanToInt("IX"));
        System.out.println(RomanToInteger.romanToInt("IV"));
        System.out.println(RomanToInteger.romanToInt("XL"));
        System.out.println(RomanToInteger.romanToInt("XC"));
        System.out.println(RomanToInteger.romanToInt("CD"));
        System.out.println(RomanToInteger.romanToInt("CM"));
        System.out.println(RomanToInteger.romanToInt("LVIII"));
        System.out.println(RomanToInteger.romanToInt("III"));
        System.out.println(RomanToInteger.romanToInt("MCMXCIV"));


    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}
