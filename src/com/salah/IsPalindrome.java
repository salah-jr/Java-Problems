package com.salah;

public class IsPalindrome {

    public boolean isPalindrome(int x) {
        if(x == 0)
            return true;
        if(x < 0 || (x % 10) == 0)
            return false;
        int reverse = 0;
        int num = x;
        while(num > reverse){
            reverse = num % 10 + reverse * 10;
            num  = (int)(num / 10);
        }
        return (num == reverse ||  num == (int)(reverse/10));
    }

}
