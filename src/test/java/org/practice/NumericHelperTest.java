package org.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumericHelperTest {
    @Test
    public void isPrimeTest(){
        Assertions.assertTrue(NumericHelper.getNumericHelperInstance().isPrime(2));
        Assertions.assertTrue(NumericHelper.getNumericHelperInstance().isPrime(5));
        Assertions.assertTrue(NumericHelper.getNumericHelperInstance().isPrime(11));
        Assertions.assertTrue(NumericHelper.getNumericHelperInstance().isPrime(19));
        Assertions.assertFalse(NumericHelper.getNumericHelperInstance().isPrime(1));
        Assertions.assertFalse(NumericHelper.getNumericHelperInstance().isPrime(22));
        Assertions.assertFalse(NumericHelper.getNumericHelperInstance().isPrime(49));

    }
}
