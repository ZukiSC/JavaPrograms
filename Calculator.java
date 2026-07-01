

public class Calculator {

    

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}

public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println("Addition: " + calculator.add(5, 3));
    System.out.println("Subtraction: " + calculator.subtract(5, 3));
    System.out.println("Multiplication: " + calculator.multiply(5, 3));
    System.out.println("Division: " + calculator.divide(5, 3));
}