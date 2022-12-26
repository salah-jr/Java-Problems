package com.salah;

import java.util.PriorityQueue;

public class KthLargestElementInTheArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : nums)
        {
            minHeap.add(i);
            if(minHeap.size() > k) minHeap.poll();
        }

        return minHeap.poll();
    }
}
