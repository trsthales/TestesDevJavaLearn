package tests;

public class TestImmutableClass {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3};
        ImmutableClass immutableObject = new ImmutableClass(originalArray);

        // Attempt to modify the original array
        originalArray[0] = 99;

        // Retrieve the values from the immutable object
        int[] retrievedArray = immutableObject.values();
        int[] retrievedArray = immutableObject.getValues();

        // Print the values to verify immutability
        System.out.println("Original array after modification: ");
        for (int value : originalArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nValues from ImmutableClass: ");
        for (int value : retrievedArray) {
            System.out.print(value + " ");
        }
    }
}
