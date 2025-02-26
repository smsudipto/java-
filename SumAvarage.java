package Array_Demo;

import java.util.Scanner;

public class SumAvarage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        double[] array = new double[10];

        array[0] = input.nextDouble();
        System.out.println("Enter the elements of the array1 :"+array[0]);
        array[1] = input.nextDouble();
        System.out.println("Enter the elements of the array2 :"+array[1]);
        array[2] = input.nextDouble();
        System.out.println("Enter the elements of the array3 :"+array[2]);
        array[3] = input.nextDouble();
        System.out.println("Enter the elements of the array4 :"+array[3]);
        array[4] = input.nextDouble();
        System.out.println("Enter the elements of the array5 :"+array[4]);
        array[5] = input.nextDouble();
        System.out.println("Enter the elements of the array6 :"+array[5]);
        array[6] = input.nextDouble();
        System.out.println("Enter the elements of the array7 :"+array[6]);
        array[7] = input.nextDouble();
        System.out.println("Enter the elements of the array8 :"+array[7]);
        array[8] = input.nextDouble();
        System.out.println("Enter the elements of the array9 :"+array[8]);
        array[9] = input.nextDouble();
        System.out.println("Enter the elements of the array10 :"+array[9]);

        double sum=array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]+array[9];
        System.out.println("Sum is :"+sum);
        System.out.println("Avarage number is :"+sum/10);

    }
}
