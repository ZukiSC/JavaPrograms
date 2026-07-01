import java.util.Scanner;

public class division {
    public static void main(String[] args)
{
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First NUmber");
        num1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        num2 = scanner.nextInt();

        if(num2 == 0 || num1 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            System.out.println("Quotient: " + (num1 / num2));
        }
}}
    