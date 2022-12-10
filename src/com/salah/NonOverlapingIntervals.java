package com.salah;

import java.util.Arrays;

public class NonOverlapingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        if (intervals.length == 0) {
            return count;
        }

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0])); // Will sort the intervals ascending based on the start time
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if(end > intervals[i][0]) {
                end = Math.min(end, intervals[i][1]);
                count++;
            } else {
                end = intervals[i][1];
            }
        }

        return count;
    }
}
