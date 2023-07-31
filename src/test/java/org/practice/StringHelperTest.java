package org.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringHelperTest {
    @Test
    public void reverseStringTest(){
        Assertions.assertEquals("edcba", StringHelper.getStringHelperInstance().reverseString("abcde"));
        Assertions.assertEquals("a", StringHelper.getStringHelperInstance().reverseString("a"));
        Assertions.assertEquals("", StringHelper.getStringHelperInstance().reverseString(""));
        Assertions.assertEquals("", StringHelper.getStringHelperInstance().reverseString(null));
    }

    @Test
    public void reverseStringType2Test(){
        Assertions.assertEquals("edcba", StringHelper.getStringHelperInstance().reverseStringType2("abcde"));
        Assertions.assertEquals("a", StringHelper.getStringHelperInstance().reverseStringType2("a"));
        Assertions.assertEquals("", StringHelper.getStringHelperInstance().reverseStringType2(""));
        Assertions.assertEquals("", StringHelper.getStringHelperInstance().reverseStringType2(null));
    }

    @Test
    public void findVowelsTest(){
        Assertions.assertTrue(StringHelper.getStringHelperInstance().findVowels("Helper"));
        Assertions.assertFalse(StringHelper.getStringHelperInstance().findVowels("TDPS"));
    }
}
