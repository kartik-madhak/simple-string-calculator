import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public StringCalculator() {
        System.out.println("StringCalculator Object Created!");
    }

    private String getDelimiter(String str){
        if (str.length() >= 3 && str.charAt(0) == '/' && str.charAt(1) == '/')
            return str.substring(2, str.indexOf("\n"));
        return ",";
    }

    private String removeDelimiterPortion(String str){
        if (str.length() >= 3 && str.charAt(0) == '/' && str.charAt(1) == '/')
            return str.substring(str.indexOf("\n") + 1);
        return str;
    }

    // This function can also handle negative numbers, but the assessment says we have to throw exception...
    int Add(String numbers) throws Exception {
        if (numbers.length() == 0)
            return 0;

        String delimiter = getDelimiter(numbers);
        numbers = removeDelimiterPortion(numbers);

        String[] number = numbers.split(Pattern.quote(delimiter));
        int sum = 0;
        ArrayList<String> negs = new ArrayList<>();
        boolean throwException = false;
        for (String num : number) {
            int n = Integer.parseInt(num.trim());
            if (n < 0) {
                negs.add(num);
                throwException = true;
            }
            sum += Integer.parseInt(num.trim());
        }
        if (throwException)
            throw new NegativeNumberException("negative numbers not allowed. Included in the string : ", negs);
        return sum;
    }
}
