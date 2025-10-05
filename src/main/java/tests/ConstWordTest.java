package tests;

public class ConstWordTest {

    public static void main(String[] args) {
        String toPrint = "olá mundo";
        ForTesting f = new ForTesting();
        String toPrint2 = f.printLine(toPrint);
        System.out.println(toPrint2);
    }
}
