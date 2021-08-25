import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    StringCalculator stringCalculator;

    @Before
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void empty(){

    }

    @Test
    public void emptyStringCheck(){
        assertEquals(0, stringCalculator.Add(""));
    }
}