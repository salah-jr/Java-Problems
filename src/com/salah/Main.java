package com.salah;


import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(f(3));
    }

    static int f(int num)
    {
        if(num > 0) return num * f(num -1);
        return 1;
    }
}