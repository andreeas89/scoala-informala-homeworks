package ro.siit.homeworkProject.ro.siit.homeworkProject.service;

import ro.siit.homeworkProject.Address;
import ro.siit.homeworkProject.Customer;
//import ro.siit.homeworkProject.service.CarService;

public class CustomerService {
    Address address1 = new Address("Cluj", "Romania", 1212);
    Customer customer = new Customer("Jenna", 2881111, 0744222555, 50000, address1);//customer.getAddress());
    //Customer c = Customer.getCustomer();

    public  boolean useGreenBonus(){
        return true;
    }
    public boolean purchaseCar(){
        return true;
    }

}
