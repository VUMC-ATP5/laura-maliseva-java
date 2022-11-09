package lekcijaSesiTest.majasDarbs;

import lekcijaSesi.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    Calculator calculator = new Calculator();

    @Test
    public void testCalculatorAdd() {
        int expectedValue = 11;
        int actualValue = calculator.add(5, 6);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testCalculatorSubstract() {
        int expectedValue = 1;
        int actualValue = calculator.substract(7, 6);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testCalculatorMultiply() {
        int expectedValue = 18;
        int actualValue = calculator.multiply(3, 6);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testCalculatorDivide() {
        float expectedValue = 6;
        float actualValue = calculator.divide(12, 2);
        Assert.assertEquals(actualValue, expectedValue);
    }
}
