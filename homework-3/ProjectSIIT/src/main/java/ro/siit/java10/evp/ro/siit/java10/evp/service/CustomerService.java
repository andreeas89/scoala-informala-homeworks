package ro.siit.java10.evp.ro.siit.java10.evp.service;

import ro.siit.java10.evp.Address;
import ro.siit.java10.evp.Car;
import ro.siit.java10.evp.Customer;
import ro.siit.java10.evp.DealerCar;
//import ro.siit.homeworkProject.service.CarService;

public class CustomerService {
    private Address address = new Address("Cluj", "Romania", 1212);
    private Customer customer = new Customer(address, "Jenna", 2881111, 0744222555, 50000);

    /**
     * @param dealerCar
     * @return
     */
    public boolean isEligible(DealerCar dealerCar) {
        if (dealerCar.getCar().isNew()) {
            return true;
        }
        System.out.println("Is NOT eligible for use Green Bonus Card because is USE car");
        return dealerCar.getCar().isNew();
    }

    /**
     * @param customer
     * @param price
     * @return
     */
    public boolean hasEnoughMoney(Customer customer, double price) {
        if (customer.getSumOfMoney() < price) {
            System.out.println("is NOT enough money");
            return false;
        } else {
            return true;
        }
    }

}
