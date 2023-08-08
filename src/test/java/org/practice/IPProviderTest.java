package org.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class IPProviderTest {
    @Test
    public void getIPV4ListOutOfTest() {
        List<String> ipv4Response = IPProvider.getIPProviderInstance().getIPV4ListOutOf("480325");
        Assertions.assertEquals(4, ipv4Response.size());
        Assertions.assertTrue(ipv4Response.contains("4.80.3.25"));
        Assertions.assertTrue(ipv4Response.contains("4.80.32.5"));
        Assertions.assertTrue(ipv4Response.contains("48.0.3.25"));
        Assertions.assertTrue(ipv4Response.contains("48.0.32.5"));
    }
}