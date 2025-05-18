package GenericsDemo;

public class IntBox {
   String data;

    public IntBox(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
    class value {
        public static void main(String[] args) {
            IntBox stringbox=new IntBox("sudipto");
            String s=(String) stringbox.getData();
            System.out.println("s:"+s);

        }
    }

