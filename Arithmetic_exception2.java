package ExceptionHandling_Demo;

public class Arithmetic_exception2 {
    public static void main(String[] args) {
       try{
           int a=args.length;
           System.out.println("a="+a);
           int b=42/a;
           int c[]={1};
           c[42]=99;
       }
       catch(ArithmeticException e){
           System.out.println("Division by Zero."+e);
       }
       catch(ArrayIndexOutOfBoundsException e1){
           System.out.println("Array index obb."+e1);
       }
        System.out.println("After try/catch block.");
    }
}
