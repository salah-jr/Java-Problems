package com.salah;

import java.util.HashSet;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++) {
            char a = sb.charAt(i);
            if(Character.isAlphabetic(a)) continue;
            if(a == '(') stack.push(i);
            else
            {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') stack.pop();
                else stack.push(i);
            }
        }

        StringBuilder result = new StringBuilder();
        HashSet<Integer> set = new HashSet<>(stack);
        for(int i=0;i<s.length();i++)
            if(!set.contains(i))
                result.append(s.charAt(i));


        return result.toString();
    }
}
