package ro.siit.java10.evp.ro.siit.java10.evp.service;

import ro.siit.java10.evp.Customer;
import ro.siit.java10.evp.GreenBonusCustomer;
import ro.siit.java10.evp.GreenBonusProgram;

import java.util.ArrayList;
import java.util.List;

public class GreenBonusProgramService {
    private static final int BUGET = 10000000;
    private static final int BONUS = 10000;

    /**
     * Populate the list of {@link GreenBonusCustomer} who buy a car with Green Bonus Card
     *
     * @return list
     */
    public List<GreenBonusCustomer> getCustomers() {
        List<GreenBonusCustomer> customers = new ArrayList<GreenBonusCustomer>();

        GreenBonusCustomer customer1 = new GreenBonusCustomer("Jenna", "Dan", "Volkswagen");
        GreenBonusCustomer customer2 = new GreenBonusCustomer("Jon", "Dan", "Renault");
        GreenBonusCustomer customer3 = new GreenBonusCustomer("Tom", "Brian", "Kya");
        GreenBonusCustomer customer4 = new GreenBonusCustomer("Alice", "Dan", "BMW");
        GreenBonusCustomer customer5 = new GreenBonusCustomer("Ben", "Brian", "Ford");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        return customers;
    }



    /**
     * It is tested if has money in buget
     * If the number of buy cars with Green Bonus is less 1000
     *
     * @param greenBonusCustomers list of customr who buy a car
     * @return True if still has money or False
     */
    public boolean stillHasMoney(List<GreenBonusCustomer> greenBonusCustomers) {
        int numberBuyers = 0;
        for (int i = 0; i < greenBonusCustomers.size(); i++) {
            numberBuyers++;
        }
        if (numberBuyers > 1000) {
            System.out.println("It's Not FOUNDS in BUDGET");
            return false;
        }
        return true;
    }
}

