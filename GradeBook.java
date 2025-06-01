import java.util.Scanner;

public class GradeBook {

    public void displayMessage(String courseName) {
        System.out.printf("Welcome to the grade book for %s!", courseName);
    }
}


class GradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the course name:");
        String nameOfCourse = input.nextLine();

        GradeBook myGradeBook = new GradeBook();
        System.out.println();
        myGradeBook.displayMessage(nameOfCourse);
    }
}
