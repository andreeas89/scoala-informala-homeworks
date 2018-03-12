package ro.siit.java10.evp.ro.siit.java10.evp.service;

import ro.siit.java10.evp.Car;
import ro.siit.java10.evp.DealerCar;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class DealerService {

    /**
     * Populate the list of cars
     *
     * @return list of {@link DealerCar}
     */
    public List<DealerCar> getCars() {
        List<DealerCar> cars = new ArrayList<DealerCar>();

        Car car1 = new Car("Volkswagen", "eU-golf", TRUE, 5000, 200, 3, 2015, FALSE, TRUE);
        DealerCar dealerCar1 = new DealerCar(car1, 10000, 3);
        Car car2 = new Car("Volkswagen", "e-Golf", TRUE, 3000, 500, 4, 2017, TRUE, FALSE);
        DealerCar dealerCar2 = new DealerCar(car2, 25000, 2);
        Car car3 = new Car("Renault", "Zoe", TRUE, 4000, 600, 3, 2017, TRUE, TRUE);
        DealerCar dealerCar3 = new DealerCar(car2, 25000, 2);
        Car car4 = new Car("BMW", "i3", TRUE, 6000, 900, 5, 2018, TRUE, TRUE);
        DealerCar dealerCar4 = new DealerCar(car2, 25000, 2);
        Car car5 = new Car("Smart", "ForTwo", FALSE, 2000, 200, 2, 2015, FALSE, FALSE);
        DealerCar dealerCar5 = new DealerCar(car2, 25000, 2);
        Car car6 = new Car("Smart", "FourTwo", TRUE, 3000, 400, 3, 2016, FALSE, TRUE);
        DealerCar dealerCar6 = new DealerCar(car2, 25000, 2);
        Car car7 = new Car("Smart", "FourTwo Cabrio", TRUE, 3000, 600, 4, 2017, TRUE, FALSE);
        DealerCar dealerCar7 = new DealerCar(car2, 25000, 2);
        Car car8 = new Car("Kia", "Soul", FALSE, 4000, 400, 3, 2016, FALSE, TRUE);
        DealerCar dealerCar8 = new DealerCar(car2, 25000, 2);
        Car car9 = new Car("Hyunday", "Ioniq", TRUE, 5000, 800, 5, 2018, TRUE, FALSE);
        DealerCar dealerCar9 = new DealerCar(car2, 25000, 2);

        cars.add(dealerCar1);
        cars.add(dealerCar2);
        cars.add(dealerCar3);
        cars.add(dealerCar4);
        cars.add(dealerCar5);
        cars.add(dealerCar6);
        cars.add(dealerCar7);
        cars.add(dealerCar8);
        cars.add(dealerCar9);

        /*for (DealerCar car : cars) {
            System.out.println(car.getCar().getManufactor() + ".." + car.getCar().getModel() + ".." + car.getStock());
        }*/
        return cars;
    }

    /**
     * Quick sort a list of {@link DealerCar} by price
     *
     * @param cars the list of {@link DealerCar}s to be sorted
     * @return sorted list by price
     */
    public List<DealerCar> quickSortPrice(List<DealerCar> cars) {

        if (cars.size() <= 1) {
            return cars;
        }
        int middle = cars.size() / 2;
        DealerCar pivot = cars.get(middle); //e valoarea din mijloc

        List<DealerCar> less = new ArrayList<DealerCar>();
        List<DealerCar> greater = new ArrayList<DealerCar>();

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice() <= pivot.getPrice()) {
                if (i == middle) {
                    continue;
                }
                less.add(cars.get(i));//ia masina de pe pozitia i
            } else {
                greater.add(cars.get(i));
            }
        }
        return concatenate(quickSortPrice(less), pivot, quickSortPrice(greater));
    }

    /**
     * Quick sort a list of {@link DealerCar}s to be sorted
     *
     * @param cars the list of {@link DealerCar}s to be sorted
     * @return sorted list by horse power
     */
    public List<DealerCar> quickSortHorsePower(List<DealerCar> cars) {
        if (cars.size() <= 1) {
            return cars;
        }
        int middle = cars.size() / 2;
        DealerCar pivot = cars.get(middle);

        List<DealerCar> less = new ArrayList<DealerCar>();
        List<DealerCar> greater = new ArrayList<DealerCar>();

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCar().getHorsePower() <= pivot.getCar().getHorsePower()) {
                if (i == middle) {
                    continue;
                }
                less.add(cars.get(i));
            } else {
                greater.add(cars.get(i));
            }
        }
        return concatenate(quickSortHorsePower(less), pivot, quickSortHorsePower(greater));
    }

    private List<DealerCar> concatenate(List<DealerCar> less, DealerCar pivot, List<DealerCar> greater) {
        List<DealerCar> sortedCars = new ArrayList<DealerCar>();
        sortedCars.addAll(less);
        sortedCars.add(pivot);
        sortedCars.addAll(greater);

        return sortedCars;
    }


}
