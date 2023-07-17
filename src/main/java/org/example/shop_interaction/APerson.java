package org.example.shop_interaction;

public abstract class APerson implements  IPerson{
    public void printContactDetails(){
        System.out.println(this.getName() + " Email is " + this.getEMail() + ", and the phone number is " + this.getPhoneNumber());
    }
}
