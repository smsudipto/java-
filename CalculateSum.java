package Sum;
public class CalculateSum {
    public static void main(String[] args) {
        int[] array =new int[10];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        array[5]=60;
        array[6]=70;
        array[7]=80;
        array[8]=90;
        array[9]=100;
        System.out.println("Array is:"+array[0]);
        System.out.println("Array is:"+array[1]);
        System.out.println("Array is:"+array[2]);
        System.out.println("Array is:"+array[3]);
        System.out.println("Array is:"+array[4]);
        System.out.println("Array is:"+array[5]);
        System.out.println("Array is:"+array[6]);
        System.out.println("Array is:"+array[7]);
        System.out.println("Array is:"+array[8]);
        System.out.println("Array is:"+array[9]);

        int sum=array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]+array[9];
        System.out.println("Sum is:"+sum);
        System.out.println("Avarage number is:"+sum/10);
    }
}
