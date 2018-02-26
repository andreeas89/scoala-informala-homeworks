package ro.siit.homeworkProject.ro.siit.homeworkProject.service;

import ro.siit.homeworkProject.Car;

public class CarService {
    Car car = new Car("Volkswagen","e-UP", "102 energy", 1000, 5000, 3, 2017, 7, 25000, "new" );

    public void filterByFastCharging(){

    }
    public void filterByIsInStock(){

    }
    public boolean isInStock(){
        return true;
    }
    public boolean isNewUse(){
        return true;
    }
}
