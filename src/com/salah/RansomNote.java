package com.salah;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        int [] chars = new int[26];

        for(char c : magazine.toCharArray()){
            chars[c - 'a']++;
        }

        for(char c : ransomNote.toCharArray()){
            if(chars[c - 'a'] == 0) return false;
            chars[c - 'a']--;
        }

        return true;
    }
}
