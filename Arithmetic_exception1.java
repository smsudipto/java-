package ExceptionHandling_Demo;

public class Arithmetic_exception1 {

        public static void main(String args[]) {
            int d = 0;
            int a=0;

            try{
                int c = 42 / d;

            }
            catch(ArithmeticException e){
                System.out.println("Division by Zero.");

            }
        }
    }


