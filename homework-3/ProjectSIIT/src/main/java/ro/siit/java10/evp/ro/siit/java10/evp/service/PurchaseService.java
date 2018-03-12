package ro.siit.java10.evp.ro.siit.java10.evp.service;

import ro.siit.java10.evp.Address;
import ro.siit.java10.evp.Car;
import ro.siit.java10.evp.Customer;
import ro.siit.java10.evp.GreenBonusProgram;

import java.util.List;

public class PurchaseService {

    //met de populate create
    //-verific eluigibil, cond
    //


    public void purchase(boolean useGreenBonus, boolean isInStock, boolean isEligibleForGreenBonus, List <Car> cars){
        System.out.println("purchase");
    }

    //IN PURCHASE
    /*   public boolean purchaseCar(DealerCar dealerCar){
     *//* if ((car. == true) & (carService.isInStock(car)) == false){
            System.out.println("The car is USE, or isn't car in stock");
        }*//*
       //if (!dealerCar.getCar().isNew || dealerCar.getStock()==0)
        //sout else
        return true;
    }*/
         /*public void addGreenBonusCustomer(List<Customer> customers, List<GreenBonusCustomer> greenBonusCustomers){
        if (useGreenBonus == true){
            greenBonusCustomers.add(costomer.getName + dealer.getName + dealerCar.getModel);
        }
     }*/

    //nu mai trebuie fac direct in purchase
/*    public  requestGreenBonus(List<GreenBonusCustomer> greenBonusCustomers) {
        if (stillHasMoney(greenBonusCustomers) == true)
            return BONUS;
        }*/
}
