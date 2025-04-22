package Practic2D_Array;

public class Array2D {
    public static void main(String[]args){
            int [][] arr=new int[2][3];
            arr[0][0]=10;
            arr[0][1]=20;
            arr[0][2]=30;
            arr[1][0]=40;
            arr[1][1]=50;
            arr[1][2]=60;
        System.out.print("2D Array is:");
            for(int row=0;2>row;row++)
            {
                for(int col=0;3>col;col++)
                {
                    System.out.print(" "+arr[row][col]);
                }
            }

        }
    }


