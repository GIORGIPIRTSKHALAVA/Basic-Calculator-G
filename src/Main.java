public class Main {

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        // Perform addition
        double sum = Calculator.add(num1, num2);
        System.out.println("Sum: " + sum);

        // Perform subtraction
        double difference = Calculator.subtract(num1, num2);
        System.out.println("Subtraction: " + difference);

        // Perform multiplication
        double product = Calculator.multiply(num1, num2);
        System.out.println("Multiply: " + product);

    }
}
