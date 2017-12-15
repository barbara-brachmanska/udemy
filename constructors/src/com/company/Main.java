package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer joeCustomer = new VipCustomer();
        VipCustomer alexCustomer = new VipCustomer("Alex","alex@gmail.com", 25.0);
        VipCustomer juniorCustomer = new VipCustomer(18.0,"junior@gmail.com");

        System.out.println("Joe " + joeCustomer.getName()
                + " limit " + joeCustomer.getCreditLimit()
                + " email: " + joeCustomer.getEmailAddress());
        System.out.println("Alex " + alexCustomer.getName()
                + " limit " + alexCustomer.getCreditLimit()
                + " email: " + alexCustomer.getEmailAddress());
        System.out.println("Junior " + juniorCustomer.getName()
                + " limit " + juniorCustomer.getCreditLimit()
                + " email: " + juniorCustomer.getEmailAddress());

       // List<VipCustomer> customers = new ArrayList<VipCustomer>();

    }


}
