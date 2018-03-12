package ro.siit.java10.evp.ro.siit.java10.evp.service;

import ro.siit.java10.evp.GreenBonusCustomer;

import java.util.Date;
import java.util.List;

public class GreenBonusCostomerService {

    public void addCustomer(List<GreenBonusCustomer> customer, String name, String dealerName, String modelCar, Date year) {
        customer.add(new GreenBonusCustomer("Jenna", "Dan", "BMW"));
    }

    public int getNumberCustomer(List<GreenBonusCustomer> customer) {
        int numberCustomer = 0;
        for (GreenBonusCustomer greenBonusCustomer : customer) {
            numberCustomer++;
            //customer.get(numberCustomer);
        }
        System.out.println(numberCustomer);
        return numberCustomer;
    }
}
