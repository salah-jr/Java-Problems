package com.salah;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;

        fill(image, sr, sc, image[sr][sc], color);

        return image;
    }

    void fill(int[][] image, int r, int c, int oldColor, int newColor)
    {
        if(r < 0 || r >= image.length || c < 0 || c >= image[r].length || image[r][c] != oldColor) return;

        image[r][c] = newColor;

        fill(image, r-1, c, oldColor, newColor);
        fill(image, r+1, c, oldColor, newColor);
        fill(image, r, c-1, oldColor, newColor);
        fill(image, r, c+1, oldColor, newColor);
    }
}
