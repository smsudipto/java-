package GradeBookDemo;

import java.util.Scanner;

public class GradeBook_ParameterDeclaring {
    public void displayMessage(String courseName){
        System.out.println("Welcome to the grade book for "+courseName);
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter the course name:");
        String courseName=input.nextLine();

        GradeBook_ParameterDeclaring myGradeBook=new GradeBook_ParameterDeclaring();
        myGradeBook.displayMessage(courseName);


    }
}
