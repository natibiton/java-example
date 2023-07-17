package org.example.shop_interaction;

public class Employee extends APerson{
    private int employee_id;
    private String employee_name;
    private String email;
    private int salary;
    private String phoneNumber;
    private Shop shop; //Assuming employee works at one shop at a time

    public Employee(int employee_id, String employee_name, Shop shop, int salary){
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.shop = shop;
        this.salary = salary;
    }

    public Employee(int employee_id, String employee_name, Shop shop){
        this(employee_id, employee_name, shop, 1000);
    }

    public int getEmployee_id(){
        return this.employee_id;
    }

    public String getEmployee_name(){
        return this.employee_name;
    }

    public int getSalary(){
        return this.salary;
    }

    public void updateSalary(int newSalary){
        if(this.salary <= newSalary) {
            this.salary = newSalary;
        }
    }

    @Override
    public String toString(){
        return "Employee details are: " +
                "Employee ID is " + this.employee_id +
                " Employee Name is " + this.employee_name +
                " Employee Salary is " + this.salary;
    }

    @Override
    public String getName() {
        return this.employee_name;
    }

    @Override
    public void setName(String name) {
        if(this.employee_name == null) {
            this.employee_name = name;
        }
    }

    @Override
    public String getEMail() {
        return this.email;
    }

    @Override
    public void setEMail(String email) {
        this.email = email;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void sellItem(String itemName){
        System.out.println("Employee " + this.getEmployee_name() + " is selling " + itemName + " from " + this.shop.getName());
        try {
            this.shop.updateInventory(this);
        }catch (Exception exp){
            System.out.println("The employee " + this.getEmployee_name() + " is regretted to inform the shopper that the shop " + this.shop.getName() +
                    " is out of " + itemName);
        }
    }

    @Override
    public void printContactDetails(){
        System.out.println(this.getName() + " Email is " + this.getEMail() + ", and the phone number is " + this.getPhoneNumber() + " works at " + shop.getName());
    }
}
