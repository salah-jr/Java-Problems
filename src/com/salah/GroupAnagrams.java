package com.salah;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();

        if (strs.length == 0) {
            list.add(Arrays.asList(""));
            return list;
        }

        if (strs.length == 1) {
            list.add(Arrays.asList(strs[0]));
            return list;
        }

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            }
            else {
                List<String> arr = new ArrayList<>();
                arr.add(strs[i]);
                map.put(key, arr);
            }
        }

        for (Map.Entry<String, List<String>> set : map.entrySet()) {
            list.add(set.getValue());
        }

        return list;
    }
}
