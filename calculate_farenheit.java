package com.company;

import java.util.Scanner;

public class calculate_farenheit {
    public static void main(String[] args) {
        float celcius;
        float fahrenheit;
        double Ans;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the celcius:");
        celcius=input.nextFloat();
        Ans=(9*celcius)/5+32;
        System.out.println("The temperature of Farenheit is :"+Ans);

    }
}
