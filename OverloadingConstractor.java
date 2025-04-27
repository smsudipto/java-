package constractorDemo;

public class OverloadingConstractor {
    int id;
    String name;
    int price;

    OverloadingConstractor(){
        System.out.println("No information.");
    }
    OverloadingConstractor(int m,String n)
    {
        id=m;
        name=n;
    }
    OverloadingConstractor(int o){
        price=o;
    }
    void display()
    {
        System.out.println("id is :"+id);
        System.out.println("name is:"+name);
        System.out.println("price is:"+price);
        System.out.println(" ");
    }


    public static void main(String[] args) {
        OverloadingConstractor overloading=new OverloadingConstractor(81,"SUDIPTO");
        overloading.display();
        OverloadingConstractor overloading1=new OverloadingConstractor(1200);
        overloading1.display();
        OverloadingConstractor overloading2=new OverloadingConstractor();


    }
}
