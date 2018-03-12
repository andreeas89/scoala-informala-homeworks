package ro.siit.java10.evp;

import java.util.ArrayList;
import java.util.List;

public class GreenBonusProgram {

    private List<GreenBonusCustomer> customer;
    private int numberCars;

    public GreenBonusProgram(List<GreenBonusCustomer> customer, int numberCars) {
        this.numberCars = numberCars;
        this.customer = customer;
    }

    public List<GreenBonusCustomer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<GreenBonusCustomer> customer) {
        this.customer = customer;
    }

    public int getNumberCars() {
        return numberCars;
    }

    public void setNumberCars(int numberCars) {
        this.numberCars = numberCars;
    }

}
