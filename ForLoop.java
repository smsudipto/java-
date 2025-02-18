package com.company;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String name;
        System.out.println("Enter your name:");
        name=input.nextLine();
        System.out.println(" ");
        System.out.println("Your name is:"+name);
        for(int i=1;i<=10000;i++)
        {
            System.out.println(i+ "."+name);
        }
input.close();
    }
}
