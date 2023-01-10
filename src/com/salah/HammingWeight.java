package com.salah;

public class HammingWeight {
    public int hammingWeight(int n) {
        // return Integer.bitCount(n);

        int ans = 0;

        while (n != 0) {
            n = n & (n - 1); // to clear the right most set bit
            ans++;
        }

        return ans;
    }
}
