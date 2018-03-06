package ro.siit.homeworkProject;

import java.util.ArrayList;
import java.util.List;

public class GreenBonusProgram {
    public static final int BUGET = 10000000;
    public static final int BONUS = 10000;
    private int numberCars;
    private List <GreenBonusCustomer> customer = new ArrayList<GreenBonusCustomer>();

    public GreenBonusProgram(int numberCars, List<GreenBonusCustomer> customer) {
        this.numberCars = numberCars;
        this.customer = customer;
    }

    public int getNumberCars() {
        return numberCars;
    }

    public void setNumberCars(int numberCars) {
        this.numberCars = numberCars;
    }

    public List<GreenBonusCustomer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<GreenBonusCustomer> customer) {
        this.customer = customer;
    }

    public static int getBUGET() {
        return BUGET;
    }

    public static int getBONUS() {
        return BONUS;
    }
}
