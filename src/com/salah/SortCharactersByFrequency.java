package com.salah;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : chars)
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        heap.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < heap.size(); i++){
            char c = heap.poll();
            for(int j = 0; j < map.get(c); j++)
            {
                ans.append(c);
            }
        }

        while(!heap.isEmpty())
        {
            char c = heap.poll();
            for(int i = 0; i < map.get(c); i++)
            {
                ans.append(c);
            }
        }


        return ans.toString();
    }
}
