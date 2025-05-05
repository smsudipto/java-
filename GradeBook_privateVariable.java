package GradeBookDemo;

import java.util.Scanner;

public class GradeBook_privateVariable {
    private String courseName;
        public void displayMessage(String Name){
            courseName=Name;
            System.out.println("Welcome to the grade book for "+courseName);
        }

        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            System.out.println("Please enter the course name:");
            String courseName=input.nextLine();

            GradeBook_privateVariable myGradeBook=new GradeBook_privateVariable();
            myGradeBook.displayMessage(courseName);


        }
    }


