import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of sides on the dice: ");
        int sides = scanner.nextInt();

        System.out.print("Enter the number of rolls: ");
        int rolls = scanner.nextInt();

        for (int i = 0; i < rolls; i++) {
            int roll = random.nextInt(sides) + 1;
            System.out.println("Roll " + (i + 1) + ": " + roll);
        }
    }
}