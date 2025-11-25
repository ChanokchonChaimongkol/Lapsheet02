import java.util.Scanner;

public class Lap204 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input hour : ");
        int num1 = scanner.nextInt();

        System.out.print("Input minute : ");
        int num2 = scanner.nextInt();

        System.out.println("Total time is " + (num1 * 60 + num2) + " minutes");
    }
}
