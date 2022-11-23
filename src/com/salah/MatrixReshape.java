package com.salah;

public class MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int matRows = mat.length, matColumns = mat[0].length;
        if (matRows * matColumns != r * c) return mat;
        int count = 0;
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = mat[count / matColumns][count % matColumns];
                count++;
            }
        }
        return arr;
    }
}
