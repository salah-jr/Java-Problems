package com.salah;

public class MySqrt {

    public int mySqrt(int x) {
        int l = 1;
        int h = x/2;
        int mid;
        int ans = 0;
        long result;
        if(x == 1 || x == 0)
            return x;

        while(l <= h){
            mid = (l+h) /2;
            result = (long)mid * (long)mid;
            if(result == x){
                return mid;
            }
            if (result < x){
                ans = mid;
                l = mid + 1;
            } else{
                h = mid - 1;
            }
        }

        return ans;

    }

}
