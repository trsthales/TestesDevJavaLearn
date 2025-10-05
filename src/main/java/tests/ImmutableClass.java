package tests;

public final class ImmutableClass {

        private final int[] values;

        public ImmutableClass(int[] values) {
            this.values = values.clone(); // Store a copy
        }

        public int[] getValues() {
            return values.clone(); // Return a copy
        }
}
