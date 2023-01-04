package com.salah;

public class MaxAreaOfIsland {
    int max = 0, maxNow = 0;

    public int maxAreaOfIsland(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1){
                    maxNow = 0;
                    dfs(i, j, grid);
                }

            }
        }

        return max;
    }

    private void dfs(int r, int c, int[][]grid) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != 1) return;

        grid[r][c] = -1; // marking part of island visited not to check it next time
        maxNow++;

        dfs(r-1, c, grid);
        dfs(r+1, c, grid);
        dfs(r, c-1, grid);
        dfs(r, c+1, grid);


        max = Math.max(max, maxNow);
    }
}
