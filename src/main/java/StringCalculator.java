public class StringCalculator {
    public StringCalculator() {
        System.out.println("StringCalculator Object Created!");
    }

    // Refactoring the function to adapt to the failing test case
    int Add(String numbers) {
        if (numbers.length() == 0) {
            return 0;  // It should return 0 for empty strings
        } else {
            return Integer.parseInt(numbers); // Should return the number itself when only one number
        }
    }
}
