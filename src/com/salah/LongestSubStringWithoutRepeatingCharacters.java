package com.salah;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        if(s.length() == 0) return 0;

        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, max = 0;

        while(j < s.length())
        {
            if(set.add(s.charAt(j))){
                max = Math.max(set.size(), max);
                j++;
            } else{
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
}
