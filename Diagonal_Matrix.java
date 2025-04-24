package Diagonal_Matrix;

import java.util.Scanner;

public class Diagonal_Matrix {
    public static void main(String[]args)
    {
        int[][] A=new int[3][3];
        int[][] B=new int[3][3];
        int sumOfDiagonalElement=0;
        int sumOfLowerBound=0;
        int sumOfUpperBound=0;
        Scanner input=new Scanner(System.in);

        System.out.print(" Inter you Matrix A:");
        for(int row=0;3>row;row++)
        {
            for(int col=0;3>col;col++)
            {
                A[row][col]=input.nextInt();
            }
        }
        System.out.println("Matrix A is:");
        for(int row=0;3>row;row++)
        {
            for(int col=0;3>col;col++)
            {
                System.out.print(" \t "+A[row][col]);
            }
            System.out.println(" ");
        }

        for(int row=0;3>row;row++)
        {
            for(int col=0;3>col;col++)
                if(row==col)
                {
                    sumOfDiagonalElement= sumOfDiagonalElement+A[row][col];
                }
           else if(row>col)
            {
                sumOfLowerBound=sumOfLowerBound+A[row][col];
            }

                else if(row<col)
                {
                    sumOfUpperBound=sumOfUpperBound+A[row][col];
                }


        }
        System.out.println(" diagonal sum is: "+sumOfDiagonalElement);
        System.out.println(" sumOfLowerBound is: "+sumOfLowerBound);
        System.out.println(" sumOfUpperBound is: "+sumOfUpperBound);
    }
}
