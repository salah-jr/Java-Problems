package com.salah;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    static int fibo(int n)
    {
        if(n < 2) return n;
        return fibo(n-1) + fibo(n-2);
    }
}  