package org.example.shop_interaction;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    private Employee employee;

    @BeforeEach
    public void initTestObject(){
        employee = new Employee(123, "Tester", new Shop("Apple", 100));
    }

    @Test
    @DisplayName("Test the constructor values")
    public void testConstructor(){
        Assertions.assertEquals(123, employee.getEmployee_id());
        Assertions.assertEquals("Tester", employee.getEmployee_name());
    }
}
