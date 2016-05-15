package com.company.MatrixSnakeTraversal;

public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
        int j = 0;
        int k = 0;
        int v = 1;

        int[] res = new int[input[0].length*input.length];

        for(int i = 0; i<input[0].length; i++){
            while( j < input.length && j >= 0  ){
                res[k++] = input[j][i];
                j+=v;
            }
            j-=v;
            v=-v;
        }

        return res;
    }
}
