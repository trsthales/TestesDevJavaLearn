package tests;

public class TestingImmutabilityOfString {
    public static void main(String[] args) {
        String original = "World";
        System.out.println("Before method call: " + original);

        ChangeValueOfString changer = new ChangeValueOfString();
        String modified = changer.modifyString(original);

        System.out.println("After method call: " + original);
        System.out.println("Returned from method: " + modified);
    }
}
