package Fibonacci;

import java.util.Scanner;

public class Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

       int first=0;
       int second=1;
        System.out.print("Fibonacci Series: " + first + ", " + second);
       for(int i=3;i<=n;i++)
       {
           int fibo=first+second;
           System.out.print(", " + fibo);
           first=second;
           second=fibo;

       }
        System.out.println(); // To move to the next line after the series
        sc.close();
e

    }

}
