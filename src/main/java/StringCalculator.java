public class StringCalculator {
    public StringCalculator() {
        System.out.println("StringCalculator Object Created!");
    }

    // As a bonus, now our method can also handle spaces along with newlines...
    int Add(String numbers) {
        if (numbers.length() == 0)
            return 0;

        String[] number = numbers.split(",");
        int sum = 0;
        for (String num : number) {
            sum += Integer.parseInt(num.trim()); // Note: used trim here
        }
        return sum;
    }
}
