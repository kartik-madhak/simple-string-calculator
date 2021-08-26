import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {
    StringCalculator stringCalculator;

    @BeforeEach
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void empty() {

    }

    @Test
    public void emptyStringCheck() throws Exception {
        assertEquals(0, stringCalculator.Add(""));
    }

    @Test
    public void oneNumberStringCheck() throws Exception {
        assertEquals(2, stringCalculator.Add("2"));
    }

    @Test
    public void twoNumberStringCheck() throws Exception {
        assertEquals(5, stringCalculator.Add("2,3"));
    }

    @Test
    public void anyNumberStringCheck() throws Exception {
        assertEquals(7, stringCalculator.Add("1,2,3,1"));
    }

    @Test
    public void anyNumberStringCheck2() throws Exception {
        assertEquals(12, stringCalculator.Add("4,2,3,1,2"));
    }

    @Test
    public void newLineCheck() throws Exception {
        assertEquals(12, stringCalculator.Add("4\n,2,3\n,1,2"));
    }

    @Test
    public void newLineCheck2() throws Exception {
        assertEquals(15, stringCalculator.Add("4\n,5\n,3\n,1\n,2\n"));
    }

    @Test
    public void delimiterCheck() throws Exception {
        assertEquals(15, stringCalculator.Add("//+\n4+5+3+1+2"));
    }

    @Test
    public void complexDelimiterCheck() throws Exception {
        assertEquals(15, stringCalculator.Add("//;\n4\n;5\n;3\n;1\n;2\n"));
    }

    @Test
    public void complexDelimiterCheck2() throws Exception {
        assertEquals(15, stringCalculator.Add("//;;\n4\n;;5\n;;3\n;;1\n;;2\n"));
    }

    @Test
    public void negativeCheck() {
        assertThrows(NegativeNumberException.class, () -> stringCalculator.Add("//;\n-1;1;-2"));
    }

    @Test
    public void biggerThan1000Check() throws Exception {
        assertEquals(11, stringCalculator.Add("//;;\n1001\n;;5\n;;3\n;;1\n;;2\n"));
    }

    @Test
    public void multipleLengthDelimiterCheck() throws Exception {
        assertEquals(11, stringCalculator.Add("//;;\n1001\n;;5\n;;3\n;;1\n;;2\n"));
    }

    @Test
    public void multipleLengthDelimiterCheck2() throws Exception {
        assertEquals(11, stringCalculator.Add("//[;;]\n1001\n;;5\n;;3\n;;1\n;;2\n"));
    }

    @Test
    public void multipleLengthDelimiterCheck3() throws Exception {
        assertEquals(11, stringCalculator.Add("//[ ]\n5 3 1 2"));
    }

    @Test
    public void multipleDelimiterCheck() throws Exception {
        assertEquals(6, stringCalculator.Add("//[*][%]\n1*2%3"));
    }

    @Test
    public void multipleDelimiterCheck2() throws Exception {
        assertEquals(10, stringCalculator.Add("//[*][%][ ]\n1*2%3 4"));
    }
}