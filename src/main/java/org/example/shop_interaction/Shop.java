package org.example.shop_interaction;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {
    @Getter
    private String name;
    private List<Employee> employeeList = new ArrayList<>();
    private int revenue, expenses;
    private int itemsToPurchase;
    private final int fixedPricedItem = 100;

    public Shop(String name, int inventoryAmount){
        this.name = name;
        this.itemsToPurchase = Math.max(inventoryAmount, 1);
    }

    public void hireEmployee(Employee emp){
        if(! employeeList.contains(emp)) {
            this.employeeList.add(emp);
        }
    }

    public void fireEmployee(Employee emp){
        if(employeeList.contains(emp)){
            employeeList.remove(emp);
        }
    }

    public void addRevenue(int amount){
        this.revenue += amount;
    }

    public void addExpenses(int amount){
        this.expenses += amount;
    }

    public int getProfit(){
        return this.revenue - this.expenses;
    }

    @Override
    public String toString(){
        return "Shop details of: " + this.name + ", has " + this.employeeList.size() + " employees, and current profit is " + this.getProfit();
    }

    public void updateInventory(Employee emp) throws Exception {
        if(itemsToPurchase > 0) {
            this.itemsToPurchase -= 1;
            this.revenue += this.fixedPricedItem;
            System.out.println("Employee " + emp.getEmployee_name() + " soled an item in " + this.name + " shop");
        }
        else {
            throw new Exception("No more items to sell");
        }
    }

    public int sellItem(String itemName){
        Random rand = new Random();
        Employee currentEmployee = employeeList.get(rand.nextInt(employeeList.size()));
        currentEmployee.sellItem(itemName);
        return this.fixedPricedItem;
    }
}
