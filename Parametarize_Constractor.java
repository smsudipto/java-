package constractorDemo;

public class Parametarize_Constractor {

        String name;
        int id;
        double CGPA;
    Parametarize_Constractor(String m,int n,double o)
        {
            name=m;
            id=n;
            CGPA=o;

        }
        void display()
        {
            System.out.println("My name is:"+name);
            System.out.println("My is is:"+id);
            System.out.println("My CGPA is :"+CGPA);
        }

        public static void main(String[] args) {
            Parametarize_Constractor d=new Parametarize_Constractor("SUDIPTO",80,3.40d);
            d.display();
        }
    }


