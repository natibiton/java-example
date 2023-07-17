package org.example.shop_interaction;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ShopperTest {
    static private Shopper someone = new Shopper("Elliot", 10);
    static private Shop Apple;

    @BeforeAll
    public static void init(){
        Apple = new Shop("Apple", 100);
        Apple.hireEmployee(new Employee(123, "Nati", Apple));
    }

    @Test
    @DisplayName("Buy something")
    @Order(1)
    public void buyItem(){
        Assertions.assertDoesNotThrow(() -> someone.purchaseItem("phone", Apple));
    }

    @Test
    @DisplayName("Buy additional item with exception")
    @Order(2)
    public void buyAdditionalItem(){
        String expectedError = "Shopper " + someone.getName() + " is out of funds...";
        Assertions.assertThrows(Exception.class, () -> someone.purchaseItem("phone", Apple), expectedError);
    }

    @Test
    @DisplayName("Adding funds for shopper")
    @Order(3)
    public void addFunds(){
        someone.addFunds(100);
        Assertions.assertDoesNotThrow(() -> someone.purchaseItem("phone", Apple));
    }

}
