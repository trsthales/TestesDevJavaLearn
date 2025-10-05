package tests;

public class ForTesting {
    //
    final int y = 10;

    // x = 20; // This line would cause a compilation error because x is final
    public String printLine(String toPrint) {
        toPrint = "Hello";
        //System.out.println("the word to be printed is: " + toPrint);
        return toPrint;
    }

}
