package immutability;

public class TestingEnumOperation {
    public static void main(String[] args) {
        final double a = 10;
        final double b = 5;

        System.out.println("Addition: " + Operation.PLUS.evaluate(a, b) + " (Operation ID: " + Operation.PLUS.getOperationId() + ")");
        System.out.println("Subtraction: " + Operation.MINUS.evaluate(a, b) + " (Operation ID: " + Operation.MINUS.getOperationId() + ")");
        System.out.println("Multiplication: " + Operation.MULTIPLY.evaluate(a, b) + " (Operation ID: " + Operation.MULTIPLY.getOperationId() + ")");
        System.out.println("Division: " + Operation.DIVIDE.evaluate(a, b) + " (Operation ID: " + Operation.DIVIDE.getOperationId() + ")");

        // Uncommenting the following line will throw an exception
        // System.out.println("Division by zero: " + Operation.DIVIDE.evaluate(a, 0));
    }
}
