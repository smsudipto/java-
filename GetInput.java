package com.company;

import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n;
        n=input.nextInt();
        System.out.println("Number is: "+n);

    }
}
