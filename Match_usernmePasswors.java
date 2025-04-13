package Match_usernmePasswors;

import java.util.Scanner;

public class Match_usernmePasswors {
    public static void main(String[]args){
        String Username="DIPTO";
        int password=1234;
        System.out.println("Inter your user name:");
        Scanner input=new Scanner(System.in);
        Username=input.nextLine();
        for(int i=0;5>i;i++){
            if(Username==Username)
            {
                System.out.println("Username is correct.");

            }
            else
            {
                System.out.println("The username is not match.please,try again.");
            }
        }
        for(int i=0;5>i;i++){
            if(password==password)
            {
                System.out.println("Password is correct.");

            }
            else
            {
                System.out.println("The password is not match.please,try again.");
            }
        }


    }
}
