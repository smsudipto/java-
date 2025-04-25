public class ArithmaticError_Find {
    public static void main(String[] args) {

        try {
            int a=10;
            int b=0;
            int result=a/b;
            System.out.println("Result is:"+result);
        }
        catch (ArrayIndexOutOfBoundsException e1) {

            System.out.println("Exception:" + e1);
        }
        catch (ArithmeticException e1){

            System.out.println("Exception:"+e1);
        }
        catch (Exception e3) {

            System.out.println("Exception:" + e3);//super most exception.
        }
        finally{
            System.out.println("last line of the program.");
        }

    }


}

