package ro.siit.java10.evp.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ro.siit.java10.evp.Car;
import ro.siit.java10.evp.Dealer;
import ro.siit.java10.evp.DealerCar;
import ro.siit.java10.evp.ro.siit.java10.evp.service.CarService;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class CarServiceTest {
    private CarService carService;

    @Before
    public void init() {
        carService = new CarService();
    }

    @Test
    public void filterByFastChargingWhenOneDealerCar() {
        List<DealerCar> cars = new ArrayList<DealerCar>();
        cars.add(new DealerCar(new Car("Volkswagen", "eU-golf", TRUE, 5000, 200, 3, 2015, FALSE, TRUE), 10000, 2));

        List<DealerCar> filterCars = carService.filterByFastCharging(cars, true);
        Assert.assertEquals(true, filterCars.get(0).getCar().isFastCharging());
    }

    @Test
    public void filterByFastCharging() {
        DealerCar dealerCar1 = new DealerCar(new Car("Volkswagen", "eU-golf", TRUE, 5000, 200, 3, 2015, FALSE, TRUE), 10000, 3);
        DealerCar dealerCar2 = new DealerCar(new Car("Volkswagen", "e-Golf", TRUE, 3000, 500, 4, 2017, TRUE, FALSE), 25000, 3);
        DealerCar dealerCar3 = new DealerCar(new Car("BMW", "i3", TRUE, 6000, 900, 5, 2018, TRUE, TRUE), 18000, 3);
        DealerCar dealerCar4 = new DealerCar(new Car("Kia", "Soul", FALSE, 4000, 400, 3, 2016, FALSE, TRUE), 7000, 3);

        List<DealerCar> dealerCars = new ArrayList<DealerCar>();
        dealerCars.add(dealerCar1);
        dealerCars.add(dealerCar2);
        dealerCars.add(dealerCar3);
        dealerCars.add(dealerCar4);

        List<DealerCar> filteredCars = carService.filterByFastCharging(dealerCars, true);

        System.out.println("Filtered cars by fastCharging");
        Assert.assertEquals(true, filteredCars.get(0).getCar().isFastCharging());
        Assert.assertEquals(true, filteredCars.get(1).getCar().isFastCharging());
        Assert.assertEquals(true, filteredCars.get(2).getCar().isFastCharging());

    }

    @Test
    public void filterByStockWhenOneDealerCar() {
        List<DealerCar> cars = new ArrayList<DealerCar>();
        cars.add(new DealerCar(new Car("Volkswagen", "eU-golf", TRUE, 5000, 200, 3, 2015, FALSE, TRUE), 10000, 2));

        List<DealerCar> filterCars = carService.filterByIsInStock(cars);
        Assert.assertEquals(2, filterCars.get(0).getStock());
    }

    @Test
    public void filterByStock() {
        DealerCar dealerCar1 = new DealerCar(new Car(), 25000, 2);
        DealerCar dealerCar2 = new DealerCar(new Car(), 10000, 1);
        DealerCar dealerCar3 = new DealerCar(new Car(), 35000, 3);
        DealerCar dealerCar4 = new DealerCar(new Car(), 18000, 4);

        List<DealerCar> dealerCars = new ArrayList<DealerCar>();
        dealerCars.add(dealerCar1);
        dealerCars.add(dealerCar2);
        dealerCars.add(dealerCar3);
        dealerCars.add(dealerCar4);

        List<DealerCar> filteredCars = carService.filterByIsInStock(dealerCars);

        Assert.assertEquals(2, filteredCars.get(0).getStock());
        Assert.assertEquals(1, filteredCars.get(1).getStock());
        Assert.assertEquals(3, filteredCars.get(2).getStock());
        Assert.assertEquals(4, filteredCars.get(3).getStock());
    }

}
