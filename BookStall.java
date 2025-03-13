package Omor_Ekushe_Boimela;

public class BookStall {
    String name;
    String address;
    int contact_info;
    int balance;
    String[] bookList={ "A","B","C","D","E"};

    void display1()
    {
        System.out.println("First book is:"+bookList[0]);
        System.out.println("second book is:"+bookList[1]);
        System.out.println("third book is:"+bookList[2]);
        System.out.println("fourth book is:"+bookList[3]);
        System.out.println("fiveth book is:"+bookList[4]);
    }
}
