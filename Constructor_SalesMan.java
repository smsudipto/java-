package constractorDemo;

import java.util.Scanner;

public class Constructor_SalesMan {
    String product;
    int price;

    // Constructor
    Constructor_SalesMan(String a, int n) {
        product = a;
        price = n;
    }

    void display() {
        System.out.println("The product is available.");
        System.out.println("Product Name: " + product);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your product name:");
        String name = input.nextLine();

        System.out.println("Enter your product price:");
        int price = input.nextInt();

        Constructor_SalesMan salesman = new Constructor_SalesMan(name, price);
        salesman.display();

        input.close();
    }
}
