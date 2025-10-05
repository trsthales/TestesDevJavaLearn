package immutability;

/**
 * Esse enum representa operações matemáticas básicas.
 * Cada operação é implementada como uma constante do enum com seu próprio método evaluate.
 * O enum é imutável por natureza, já que os valores dos enums não podem ser alterados após a definição.
 * Cada operação também possui um ID associado que pode ser acessado através do método getOperationId().
 * O construtor do enum é privado e é chamado apenas internamente para definir as operações.
 * @author ChatGPT
 * @date 05/10/2025
 */
public enum Operation {
    PLUS{
        final int operationId = 1;
        double evaluate(double x, double y) {
            return x + y;
        }
        public int getOperationId() {
            return operationId;
        }
    },
    MINUS{
        final int operationId = 2;
        double evaluate(double x, double y) {
            return x - y;
        }
        public int getOperationId() {
            return operationId;
        }
    },MULTIPLY{
        final int operationId = 3;
        double evaluate(double x, double y) {
            return x * y;
        }
        public int getOperationId() {
            return operationId;
        }
    },DIVIDE{
        final int operationId = 4;
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
