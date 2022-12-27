package com.salah;

import java.util.PriorityQueue;

public class KthClosestPointToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        if(k == points.length) return points;

        // Sort ascending by distance between each point and origin (0,0)
        // sqrt((x1 - x2)^2 + (y1 - y2)^2) where x2,y2 will always be (0,0)
        PriorityQueue<int[]> pq = new PriorityQueue<>((p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);

        for (int[] p : points) {
            pq.add(p);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] res = new int[k][2];
        int i = 0;
        while (i < k) {
            res[i] = pq.poll();
            i++;
        }

        return res;
    }
}
