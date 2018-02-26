package ro.siit.homeworkProject.ro.siit.homeworkProject.service;

import ro.siit.homeworkProject.Customer;
import ro.siit.homeworkProject.GreenBonusCustomer;
import ro.siit.homeworkProject.GreenBonusProgram;

import java.util.ArrayList;
import java.util.List;

public class GreenBonusProgramService {
    GreenBonusProgram gb = new GreenBonusProgram(2, getListCustomer());

    public List <GreenBonusCustomer> getListCustomer(){
        List <GreenBonusCustomer> customer = new ArrayList<GreenBonusCustomer>();
        GreenBonusCustomer customer1 = new GreenBonusCustomer();
        customer.add(customer1);
        return customer;
    }

   /* public void addGreenBonusCustomer(){
    }*/
    public boolean requestGreenBonus(){

        return true;
    }
    public boolean stillHasMoney(){

        return true;
    }
}

