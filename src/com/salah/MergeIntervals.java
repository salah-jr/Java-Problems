package com.salah;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int size = intervals.length;
        int[] start = new int[size];
        int[] end = new int[size];

        ArrayList<int[]> result = new ArrayList<>();

        for(int i = 0; i < size; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int p1 = 0;
        int p2 = 1;

        while(p2 <= size){
            if(p2 == size || start[p2] > end[p2-1]){
                int[] interval = new int[]{start[p1], end[p2-1]};
                result.add(interval);
                p1 = p2;
            }
            p2++;
        }

        return result.toArray(new int[result.size()][2]);
    }
}
