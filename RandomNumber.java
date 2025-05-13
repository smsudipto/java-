package randomNumber_demo;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(90);
            System.out.println("Random number: " + randomNumber);
        }
    }


