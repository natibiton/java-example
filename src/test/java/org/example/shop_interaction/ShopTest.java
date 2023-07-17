package org.example.shop_interaction;


import org.junit.jupiter.api.*;

import java.time.Duration;

public class ShopTest {
    private Shop shop;

    @BeforeEach
    public void initTestObject(){
        shop = new Shop("Apple", 100);
    }

    @Test
    @DisplayName("Test the constructor values")
    public void testConstructor(){
        Assertions.assertEquals(shop.getName(), "Apple");
        Assertions.assertEquals(shop.getProfit(), 0);
    }

    @Test
    @DisplayName("Check the inventory out of stock exception")
    public void checkInventoryException(){
        shop = new Shop("Apple", 1);
        Employee emp = new Employee(123, "Tester", new Shop("Apple", 100));
        Assumptions.assumeTrue(shop != null, "It seems that the shop object is not initialized"); //If not true, will abort this test
        Assertions.assertDoesNotThrow(() -> shop.updateInventory(emp));
        Assertions.assertThrows(Exception.class, () -> shop.updateInventory(emp), "No more items to sell");
        Assertions.assertTimeout(Duration.ofNanos(10), () -> shop.getName()); //Just an example to get timeout
    }
}
