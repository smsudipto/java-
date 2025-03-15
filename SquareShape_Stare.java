package SquareDemo;

import java.util.Scanner;

public class SquareShape_Stare {
    public static void main(String[] args)
    {
        String A;
        Scanner input =new Scanner(System.in);
        System.out.println("Inter your String:");
        A=input.nextLine();
        System.out.println("String is:"+A);

        for(int a=5;a>=1;a--)
        {
            //for(int b=1;b<=a;b++)
            for(int b=1;b<=5;b++)
            {
                System.out.print(" "+A);
            }
            System.out.println(" ");
        }
input.close();
    }
}
