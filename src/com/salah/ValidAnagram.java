package com.salah;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()){
            return false;
        }

        int [] chars = new int[26] ;

        for(char c : s.toCharArray()){
            chars[c - 'a']++;
        }

        for(char c : t.toCharArray()){
            if(chars[c-'a'] == 0){
                return false;
            }
            chars[c-'a']--;
        }
        return true;
    }
}
