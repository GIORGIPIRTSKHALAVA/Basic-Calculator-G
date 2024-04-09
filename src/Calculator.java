/**
 * The Calculator class provides basic arithmetic operations such as addition,
 * subtraction, multiplication, and division.
 * @author Giorgi
 * @version 1
 */
public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The result of the addition operation.
     */
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Subtracts one number from another.
     *
     * @param num1 The number to be subtracted from.
     * @param num2 The number to subtract.
     * @return The result of the subtraction operation.
     */
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The result of the multiplication operation.
     */
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Divides one number by another.
     *
     * @param dividend The number to be divided (dividend).
     * @param divisor The number to divide by (divisor).
     * @return The result of the division operation.
     * @throws ArithmeticException if the divisor is zero.
     */
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }
}
