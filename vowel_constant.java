package vowel_constant;

import java.util.Scanner;

public class vowel_constant {
    public static void main(String[] args){
        char c;
        System.out.println("inter your character:");
         Scanner input=new Scanner(System.in);
         c=input.next().charAt(0);

         if(c=='a' || c=='A')
         {
             System.out.println("character is vowel.");
         }
         else if(c=='e' || c=='E')
         {
             System.out.println("character is vowel.");
         }
         else if(c=='I' || c=='i')
         {
             System.out.println("character is vowel.");
         }
         else if(c=='u' || c=='U')
         {
             System.out.println("character is vowel.");
         }
         else
         {
             System.out.println("consonent");
         }


    }

}
