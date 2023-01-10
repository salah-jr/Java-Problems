package com.salah;

public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.bitCount(n) == 1;

        /* OR
         return n>0 && (n&(n-1))==0;
         n = 16 = 1 0 0 0 0
         n-1 = 15 = 0 1 1 1 1
         n & n-1 = 0 0 0 0 0
         */
    }
}
