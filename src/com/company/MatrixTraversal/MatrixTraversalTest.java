package com.company.MatrixTraversal;

import org.junit.Assert;
import org.junit.Test;

public class MatrixTraversalTest {
    MatrixTraversal matrixTraversal = new MatrixTraversal();
    @Test
    public void SimpleMatrixTraversal(){
        int[][] input = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int[] expected = {1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10};

        int[] actualresult = matrixTraversal.print(input);

        Assert.assertArrayEquals("Error",expected,actualresult);
    }
    @Test
    public void SimpleMatrixTraversal_2(){
        int[][] input = {{1,}};
        int[] expected = {1,};

        int[] actualresult = matrixTraversal.print(input);

        Assert.assertArrayEquals("Error",expected,actualresult);
    }
    @Test
    public void SimpleMatrixTraversal_3(){
        int[][] input = {{1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};
        int[] expected = {1,2,3,6,9,12,11,10,7,4,5,8};

        int[] actualresult = matrixTraversal.print(input);

        Assert.assertArrayEquals("Error",expected,actualresult);
    }
    @Test
    public void SimpleMatrixTraversal_4(){
        int[][] input = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        int[] expected = {1,2,3,4,8,12,11,10,9,5,6,7};

        int[] actualresult = matrixTraversal.print(input);

        Assert.assertArrayEquals("Error",expected,actualresult);
    }

}
