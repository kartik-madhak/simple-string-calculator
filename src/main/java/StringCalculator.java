import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public StringCalculator() {
        System.out.println("StringCalculator Object Created!");
    }

    /**
     * @param str String to get delimiters from.
     *            If no delimiters are provided, then takes ',' as default.
     *            The delimiters must follow a specific format: -
     *            //[delimiter1][delimiter2] ... [delimiterN]\n ...
     *            <br>
     *            <br>
     *            It should be noted that if 'delimiter' part is not enclosed
     *            with '[]' brackets, then the whole part is considered as a delimiter.
     *
     *            <br>
     *            Example Strings: -
     *            <pre>{@code
     *                       1;2;3
     *                       //;\n1;2;3
     *                       //[;]\n1;2;3
     *                       //[;][,]\n1,2;3,4
     *                       //[;,][,;]\n1,;2;,3,;4
     *                       //[ ]\n1 2 3 4
     *                       }
     *                       </pre>
     * @return Returns the delimiters as an ArrayList<String>
     */
    private ArrayList<String> getDelimiters(String str) {
        ArrayList<String> delimiters = new ArrayList<>();
        if (str.length() >= 3 && str.charAt(0) == '/' && str.charAt(1) == '/') {
            String delimiterString = str.substring(2, str.indexOf("\n"));

            Matcher matcher = Pattern.compile("\\[([^]]+)").matcher(delimiterString);

            int pos = -1;
            while (matcher.find(pos + 1)) {
                pos = matcher.start();
                delimiters.add(matcher.group(1));
            }
            if (pos == -1)
                delimiters.add(delimiterString);

            for (String delimiter : delimiters) {
                System.out.println(delimiter);
            }
            return delimiters;
        }
        delimiters.add(",");
        return delimiters;
    }

    /**
     * @param str String to remove delimiter section from. See 'getDelimiters(String str)' method for more info
     * @return String without delimiter section
     */
    private String removeDelimiterPortion(String str) {
        if (str.length() >= 3 && str.charAt(0) == '/' && str.charAt(1) == '/')
            return str.substring(str.indexOf("\n") + 1);
        return str;
    }

    /**
     * @param str        String to tokenize based on the delimiter
     * @param delimiters The delimiters used to split 'str'
     * @return The tokenized string
     */
    private String[] tokenizer(String str, ArrayList<String> delimiters) {

        for (String delimiter : delimiters) {
            String dd = Pattern.quote(delimiter);
            str = str.replaceAll(dd, "{split}");
        }
        return str.split("\\{split}");
    }

    /**
     * @param numbers String containing delimiters-separated integers. By default, ',' is used as delimiter.
     *                <p>
     *                To specify custom delimiter, use the following format: -
     *                //[delimiter1][delimiter2] ... [delimiterN]\n ...
     *                <br>
     *                <br>
     *                It should be noted that if 'delimiter' part is not enclosed
     *                with '[]' brackets, then the whole part is considered as a delimiter.
     *
     *                <br>
     *                Example Strings: -
     *                <pre>{@code
     *                             1;2;3
     *                             //;\n1;2;3
     *                             //[;]\n1;2;3
     *                             //[;][,]\n1,2;3,4
     *                             //[;,][,;]\n1,;2;,3,;4
     *                             //[ ]\n1 2 3 4
     *                             }
     *                             </pre>
     * @return Sum of all the integers in the string.
     * @throws Exception Throws NegativeNumberException if any of the number is negative
     */
    int Add(String numbers) throws Exception {
        if (numbers.length() == 0)
            return 0;

        ArrayList<String> delimiters = getDelimiters(numbers);

        numbers = removeDelimiterPortion(numbers);

        String[] number = tokenizer(numbers, delimiters);

        int sum = 0;
        ArrayList<String> negs = new ArrayList<>();
        boolean throwException = false;
        for (String num : number) {
            int n = Integer.parseInt(num.trim());
            if (n > 1000)
                continue;
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
