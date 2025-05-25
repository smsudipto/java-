package GenericDemo;

public class PracticGeneric<Object> {
    private Object value;
    public void setValue(Object value)
    {
        this.value=value;
    }
    public Object getValue()
    {
        return value;
    }
    public static void main(String[] args) {

        PracticGeneric<Integer> list=new PracticGeneric<>();
        list.setValue(3081);
      Integer a=(Integer)list.getValue();
        System.out.println(a);


    }
}
