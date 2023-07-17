package org.example.shop_interaction;

public class Shopper extends APerson{
    private int funds;
    private String name;
    private String email;
    private String phoneNumber;

    public Shopper(String name, int funds){
        this.name = name;
        this.funds = funds;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString(){
        return "Shopper " + this.getName() + " has funds in the amount of " + this.funds;
    }

    public void purchaseItem(String name, Shop shop) throws Exception {
        if(funds > 0) {
            int price = shop.sellItem(name);
            funds -= price;
        }
        else{
            throw new Exception("Shopper " + name + " is out of funds...");
        }
    }
    public void addFunds(int funds){
        this.funds += funds;
    }
}
