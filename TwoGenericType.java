package GenericsPrameterizedClasses;

public class TwoGenericType<E,T> {
    E firstData;
    T secondData;

    public TwoGenericType(E firstData,T secondData){
        this.firstData=firstData;
        this.secondData=secondData;
    }
    public E getFirstData(){
        return firstData;
    }
    public T getSecondData(){
        return secondData;
    }

}
class Main{
    public static void main(String[] args) {
        TwoGenericType<String,Integer> dipto=new TwoGenericType<>("Sudipto",42);
        String s =dipto.getFirstData();
        int t=dipto.getSecondData();
        System.out.println("S:"+s);
        System.out.println("T"+t);
    }
}
