package com.company;

/**
 * Created by Basia Epam on 14.12.2017.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer(){
        this("Joe","aa@gmail.com",23.0);
    }

    public VipCustomer(String name, String emailAddress, double creditLimit){
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(double creditLimit, String emailAddress){
        this("junior",emailAddress,creditLimit);
    }
}
