package com.company.MatrixSnakeTraversal;

import org.junit.Assert;
import org.junit.Test;

public class MatrixSnakeTraversalTest {
    MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();
    @Test
    public void SimpleMatrixSnakeTraversal(){
        int[][] input = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[] expected = {1,4,7,8,5,2,3,6,9};

        int[] actualresult = matrixSnakeTraversal.print(input);

        Assert.assertArrayEquals("Error",expected,actualresult);
    }
    @Test
    public void SimpleMatrixSnakeTraversal_2(){
        int[][] input = {{1,2},
                {3,4},
                {5,6}};
        int[] expected = {1,3,5,6,4,2};

        int[] actualresult = matrixSnakeTraversal.print(input);

        Assert.assertArrayEquals("Error",expected,actualresult);
    }

}
