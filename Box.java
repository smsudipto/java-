package GenericsPrameterizedClasses;

public class Box<E> {

        E data;
        public Box(E data)
        {
            this.data=data;
        }
        public E getData()
        {
            return data;
        }
    }
    class dipto{
        public  static void main(String[] args)
        {
          Box<Integer> intbox=new Box<>(42);
          int a=(Integer) intbox.getData();
          Box<String> strbox=new Box<>("sudipto");
          String s=(String)strbox.getData();
            System.out.println("A="+a);
            System.out.println("B="+s);
        }

    }


