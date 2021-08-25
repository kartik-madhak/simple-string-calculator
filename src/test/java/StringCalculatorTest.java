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

    @Test
    public void oneNumberStringCheck(){
        assertEquals(2, stringCalculator.Add("2"));
    }

    @Test
    public void twoNumberStringCheck(){
        assertEquals(5, stringCalculator.Add("2,3"));
    }

    @Test
    public void anyNumberStringCheck(){
        assertEquals(7, stringCalculator.Add("1,2,3,1"));
    }

    @Test
    public void anyNumberStringCheck2(){
        assertEquals(12, stringCalculator.Add("4,2,3,1,2"));
    }
}