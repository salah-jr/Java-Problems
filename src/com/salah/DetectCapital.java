package com.salah;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if(word.length() <= 1) return true;

        boolean firstUpper = false;
        boolean firstLower = false;
        boolean secondUpper = false;

        if(Character.isUpperCase(word.charAt(0))) firstUpper = true;
        if(Character.isLowerCase(word.charAt(0))) firstLower = true;
        if(Character.isUpperCase(word.charAt(1))) secondUpper = true;


        if(firstLower)
        {
            for(int i = 1; i < word.length(); i++)
            {
                if(Character.isUpperCase(word.charAt(i))) return false;
            }
        }

        if(firstUpper)
        {
            for(int i = 1; i < word.length(); i++)
            {
                if(secondUpper)
                {
                    if(!Character.isUpperCase(word.charAt(i))) return false;
                } else{
                    if(Character.isUpperCase(word.charAt(i))) return false;
                }
            }
        }

        return true;
    }
}
