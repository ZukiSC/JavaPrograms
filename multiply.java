
import java.util.Scanner;
public class multiply {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = scanner.nextInt();
        System.out.println("Product: " + (num1 * num2));

        scanner.close();
    }
}
