package com.salah;

import java.util.HashMap;
import java.util.Map;

public class MinimumRoundsToCompleteAllTasks {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : tasks) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        int rounds = 0;
        for (int taskCount : map.values()) {
            if (taskCount == 1) return -1;

            // Add the number of rounds needed to process the tasks with count greater than or equal to 3
            rounds += taskCount / 3;

            // If there are any tasks left with count less than 3, we need an additional round
            // to process these tasks
            if(taskCount % 3 != 0) rounds++;
        }

        return rounds;
    }
}
