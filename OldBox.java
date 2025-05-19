//Cast Exceptions at Runtime
package GenericsDemo;

import java.sql.SQLOutput;

public class OldBox {
    Object data;
    public OldBox(Object data){
        this.data=data;
    }

    public Object getData() {
        return data;
    }


}
class Main{
    public static void main(String[] args) {
        OldBox intBox=new OldBox(42);
        int x=(Integer) intBox.getData();

        OldBox starBox=new OldBox("hi");
        String s=(String) starBox.getData();
        System.out.println("x="+x);
        System.out.println("S="+s);
    }

}