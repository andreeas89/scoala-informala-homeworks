package ro.siit.homeworkProject.ro.siit.homeworkProject.service;

import ro.siit.homeworkProject.Address;
import ro.siit.homeworkProject.Car;
import ro.siit.homeworkProject.Customer;
import ro.siit.homeworkProject.GreenBonusProgram;

import java.util.List;

public class PurchaseService {
    Address a1 = new Address("London", "UK", 121);
    Customer customer = new Customer("Jenna", 12545, 0422154235,70000,a1); //customer.getAddress());
    //Customer c = customer.getCustomer();

    GreenBonusProgramService obj = new GreenBonusProgramService();
    GreenBonusProgram gbp = new GreenBonusProgram(5, obj.getListCustomer());

    public void purchase(boolean useGreenBonus, boolean isInStock, boolean isEligibleForGreenBonus, List <Car> cars){
        System.out.println("purchase");
    }
}
