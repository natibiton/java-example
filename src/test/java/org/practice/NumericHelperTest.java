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

    @Test
    public void isSumExistsTest(){
        int[] items = new int[]{ 1,4,4,8,12 };
        Assertions.assertFalse(NumericHelper.getNumericHelperInstance().isSumExists(items, 11));
        Assertions.assertFalse(NumericHelper.getNumericHelperInstance().isSumExists(items, 2));
        Assertions.assertFalse(NumericHelper.getNumericHelperInstance().isSumExists(items, 3));
        Assertions.assertTrue(NumericHelper.getNumericHelperInstance().isSumExists(items, 5));
        Assertions.assertTrue(NumericHelper.getNumericHelperInstance().isSumExists(items, 8));
        Assertions.assertTrue(NumericHelper.getNumericHelperInstance().isSumExists(items, 9));
        Assertions.assertTrue(NumericHelper.getNumericHelperInstance().isSumExists(items, 12));
        Assertions.assertTrue(NumericHelper.getNumericHelperInstance().isSumExists(items, 13));
        Assertions.assertTrue(NumericHelper.getNumericHelperInstance().isSumExists(items, 16));
        Assertions.assertTrue(NumericHelper.getNumericHelperInstance().isSumExists(items, 20));
    }
}
