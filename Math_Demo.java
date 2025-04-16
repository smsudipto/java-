package Math_demo;

import java.util.Scanner;

public class Math_Demo {
    public static void main(String[] args){
        int a;
        int b;
        int result;
        Scanner input=new Scanner(System.in);
        System.out.println("inter your a:");
        a=input.nextInt();
        System.out.println("a="+a);

        System.out.println("inter your b:");
        b=input.nextInt();
        System.out.println("a="+b);

        a=Math.abs(a);
        System.out.println("Absulate value is:"+a);

        System.out.println("PI value is:"+Math.PI);


        double d=Math.pow( a,b);
        System.out.println("power value is:"+d);

    }
}
