import java.util.ArrayList;

public class NegativeNumberException extends Exception{
    public NegativeNumberException(String message, ArrayList<String> numbers) {
        super(message + String.join(",", numbers));
    }
}
