package ro.siit.java10.evp;

import static java.lang.Boolean.TRUE;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Dealer {
    private List<DealerCar> cars = new ArrayList<DealerCar>();
    private String manufacturer;
    private String nameDealer;


    public Dealer(String manufacturer, String nameDealer, List<DealerCar> cars) {
        this.manufacturer = manufacturer;
        this.nameDealer = nameDealer;
        this.cars = cars;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getNameDealer() {
        return nameDealer;
    }

    public void setNameDealer(String nameDealer) {
        this.nameDealer = nameDealer;
    }

    public List<DealerCar> getCars() {
        return cars;
    }

    public void setCars(List<DealerCar> cars) {
        this.cars = cars;
    }
}
