package ro.siit.java10.evp.ro.siit.java10.evp.service;

import ro.siit.java10.evp.Car;
import ro.siit.java10.evp.DealerCar;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;

public class CarService {

    /**
     * Filter list of {@Link DealerCar} by fastCharging, if is true or false
     *
     * @param dealerCars
     * @param fastCharging
     * @return a new list filtered by fast charging
     */
    public List<DealerCar> filterByFastCharging(List<DealerCar> dealerCars, boolean fastCharging) {
        List<DealerCar> filterCars = new ArrayList<DealerCar>();
        for (DealerCar cars : dealerCars) {
            if (cars.getCar().isFastCharging() == true) {
                filterCars.add(cars);
            }
        }
        return filterCars;
    }

    /**
     * @param dealerCars
     * @return
     */
    public List<DealerCar> filterByIsInStock(List<DealerCar> dealerCars) {
        List<DealerCar> filterCars = new ArrayList<DealerCar>();
        for (DealerCar cars : dealerCars) {
            if (cars.getStock() > 0) {
                filterCars.add(cars);
            }
        }
        return filterCars;
    }

    /**
     * @param dealerCarCar
     * @return
     */
    public boolean isInStock(DealerCar dealerCarCar) {
        if (dealerCarCar.getStock() == 0) {
            return false;
        } else {
            return true;
        }
    }
}