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

    // As a bonus, now our method can also handle spaces along with newlines...
    int Add(String numbers) {
        if (numbers.length() == 0)
            return 0;

        String delimiter = getDelimiter(numbers);
        numbers = removeDelimiterPortion(numbers);

        String[] number = numbers.split(Pattern.quote(delimiter));
        int sum = 0;
        for (String num : number) {
            sum += Integer.parseInt(num.trim()); // Note: used trim here
        }
        return sum;
    }
}
