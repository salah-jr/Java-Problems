package com.salah;

public class ReverseWordsInStringII {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++)
        {
            if(chars[i] != ' ')
            {
                int j = i;
                while(j + 1 != chars.length && chars[j + 1] != ' ') j++;
                reverse(chars, i, j);
                i = j;
            }
        }

        return new String(chars);
    }

    void reverse(char[] chars, int l, int r)
    {
        while(l < r)
        {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            r--;
            l++;
        }
    }
}
