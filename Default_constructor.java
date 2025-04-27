package constractorDemo;

public class Default_constructor {
    String name;
    int id;
    float CGPA;
    Default_constructor()
    {
        System.out.println("No value is available.");
    }
    void display()
    {
        System.out.println("My name is:"+name);
        System.out.println("My is is:"+id);
        System.out.println("My CGPA is :"+CGPA);
    }

    public static void main(String[] args) {
        Default_constructor d=new Default_constructor();
        d.display();
    }
}
