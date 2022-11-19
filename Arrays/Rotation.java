package com.astush;

import javax.imageio.ImageTranscoder;
import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}};
        int[][] target = {{1, 1, 1},
                {0, 1, 0},
                {0, 0, 0}};
        boolean ans = findRotation(mat, target);
        System.out.println(ans);
    }

    static int[][] rotate(int[][] mat) {
        int n = mat.length;
        int m=mat[0].length;
        int[][] b=new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[j][n-i-1]=mat[i][j];
            }
        }
       return b;
    }

    static boolean check(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (target[i][j] != mat[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


    static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < 4; i++) {
            if (check(mat, target)) {
                return true;
            }
            mat=rotate(mat);
        }
        return false;
    }
}

