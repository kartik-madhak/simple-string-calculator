public class StringCalculator {
    public StringCalculator() {
        System.out.println("StringCalculator Object Created!");
    }

    // The method logic just became a little complicated as tests began to increase
    int Add(String numbers) {
        if (numbers.length() == 0)
            return 0;

        String[] number = numbers.split(",");
        int sum = 0;
        for (String num : number) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
