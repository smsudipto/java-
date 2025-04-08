
package Call_center;
import java.net.SocketOption;
import java.util.Scanner;
public class Call_center {
    public static void main(String[] args) {
        int digit;
        Scanner input = new Scanner(System.in);
        System.out.println("Inter you digit:");
        digit = input.nextInt();
        switch (digit)
        {
            case 1:
            System.out.println("select language in bengalli.");
            break;

            case 2:
                System.out.println("select language in Hindi.");
                break;

            case 3:
                System.out.println("select language in urdue.");
                break;

            case 4:
                System.out.println("select language in english.");
                break;

            case 5:
                System.out.println("Not language selected.");
        }
    }
}
