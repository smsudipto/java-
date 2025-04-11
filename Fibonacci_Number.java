package FinboNaccinumber;

import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[]args){
        int first=0;
        int second=1;
        int fibo;
        int n;
        System.out.println("inter your number:");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        System.out.print("Fibonacci series is:");
        System.out.print(first+" "+second);
        for(int i=3;n>=i;i++)
        {
            fibo=first+second;
            first=second;
            second=fibo;
            System.out.print(" " +fibo);
        }

    }
}
