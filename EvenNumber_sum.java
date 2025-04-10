import java.util.Scanner;

public class EvenNumber_sum {
    public static void main(String[] args){
        int n;
        int m;
int sum=0;
        Scanner input =new Scanner(System.in);
        System.out.println("Get input n:");
        n=input.nextInt();
        System.out.println("Get input m:");
        m=input.nextInt();


System.out.println("Eaven value is:");
        for(int i=n;m>=i;i+=2)
        {l

            System.out.println(i);
             sum=sum+i;


        }

        System.out.println("sum is:"+sum);


    }
}
