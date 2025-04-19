package Array_AutometicallyPrint;

import java.util.Scanner;

public class Array_AutometicallyPrint {
    public static void main(String[]args)
    {
        int[][] A=new int[4][5];
     int k=0;
        Scanner input=new Scanner(System.in);


        for(int row=0;4>row;row++)
        {
            for(int col=0;5>col;col++)
            {
                A[row][col]=k;
                k++;

            }
        }

        System.out.println(" Matrix A is:");
        for(int row=0;4>row;row++)
        {
            for(int col=0;5>col;col++)
            {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println(" ");
        }
    }
}
