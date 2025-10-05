package immutability;

public enum Operation {
    PLUS{
        int operationId = 1;
        double evaluate(double x, double y) {
            return x + y;
        }
        public int getOperationId() {
            return operationId;
        }
    },
    MINUS{
        int operationId = 2;
        double evaluate(double x, double y) {
            return x - y;
        }
        public int getOperationId() {
            return operationId;
        }
    },MULTIPLY{
        int operationId = 3;
        double evaluate(double x, double y) {
            return x * y;
        }
        public int getOperationId() {
            return operationId;
        }
    },DIVIDE{
        int operationId = 4;
        double evaluate(double x, double y) {
            if (y == 0) {
                throw new IllegalArgumentException("Division by zero is not allowed.");
            }
            return x / y;
        }
        public int getOperationId() {
            return operationId;
        }
    };

    abstract double evaluate(double x, double y);

    abstract int getOperationId();
}
