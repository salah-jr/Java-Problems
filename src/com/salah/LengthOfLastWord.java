package com.salah;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int length = s.length()-1;

        while(s.charAt(length) == ' ') length--;

        while(length >= 0 && s.charAt(length) != ' ') {
            count++;
            length--;
        }

        return count;
    }
}
