package Wrapper_Box;

public class Wrapper_Box {
    public static void main(String[] args) {
        int a = 30;

        // Primitive to object (Autoboxing)
        Integer b = Integer.valueOf(a);
        System.out.println("Autoboxing value is: " + b);

        Integer c = a; // Autoboxing
        System.out.println("Autoboxing is: " + c);

        // Using Wrapper class Double instead of primitive double
        Double d = new Double(10.25);
        System.out.println(" d is = " + d);

        double e = d.doubleValue(); // Correct method name
        System.out.println("Unboxing d is e = " + e);
    }
}
