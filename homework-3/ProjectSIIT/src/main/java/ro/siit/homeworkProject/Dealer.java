package ro.siit.homeworkProject;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private String manufacturer;
    private String nameDealer;
    private List <Car> cars = new ArrayList<Car>();

    public Dealer(String manufacturer, String nameDealer, List<Car> cars) {
        this.manufacturer = manufacturer;
        this.nameDealer = nameDealer;
        this.cars = cars;
        this.cars = cars;
    }

    public Dealer() {
    }
    public List<Car> getListCars(){
        List <Car> cars = new ArrayList<Car>();
        Car car1 = new Car("Volkswagen", "eU-golf", "v5", 5000, 200, 2, 2015, 3, 25000, "use");
        cars.add(car1);
        return cars;
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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
