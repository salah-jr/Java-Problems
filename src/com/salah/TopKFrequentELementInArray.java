package com.salah;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentELementInArray {
    public int[] topKFrequent(int[] nums, int k) {

        if (k == nums.length) {
            return nums;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums)
        {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        maxHeap.addAll(map.keySet());

        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = maxHeap.poll();
        }

        return ans;
    }
}
