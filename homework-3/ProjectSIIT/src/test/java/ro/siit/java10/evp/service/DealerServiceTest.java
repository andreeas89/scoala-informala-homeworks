package ro.siit.java10.evp.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ro.siit.java10.evp.Car;
import ro.siit.java10.evp.DealerCar;
import ro.siit.java10.evp.ro.siit.java10.evp.service.DealerService;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class DealerServiceTest {
    private DealerService dealerService;

    @Before
    public void init(){
        dealerService = new DealerService();
    }

    @Test
    public void quickSortPriceWhenOneDealerCar() {

        List<DealerCar> cars = new ArrayList<DealerCar>();
        cars.add(new DealerCar(new Car(), 10000, 2));

        List<DealerCar> sortedCars = dealerService.quickSortPrice(cars);//creez o noua lista cu valorile sortate
        Assert.assertEquals(1, sortedCars.size());
    }

    @Test
    public void quickSortPrice() {
        DealerCar dealerCar1 = new DealerCar(new Car(), 10000, 3);
        DealerCar dealerCar2 = new DealerCar(new Car(), 25000, 3);
        DealerCar dealerCar3 = new DealerCar(new Car(), 18000, 3);
        DealerCar dealerCar4 = new DealerCar(new Car(), 7000, 3);

        List<DealerCar> dealerCars = new ArrayList<DealerCar>();
        dealerCars.add(dealerCar1);
        dealerCars.add(dealerCar2);
        dealerCars.add(dealerCar3);
        dealerCars.add(dealerCar4);

        List<DealerCar> sortedCars = dealerService.quickSortPrice(dealerCars);
        System.out.println(sortedCars);
        Assert.assertTrue(7000 == sortedCars.get(0).getPrice());
        Assert.assertTrue(10000 == sortedCars.get(1).getPrice());
        Assert.assertTrue(18000 == sortedCars.get(2).getPrice());
        Assert.assertTrue(25000 == sortedCars.get(3).getPrice());

    }


    @Test
    public void quickSortHorsePowerWhenOneDealerCar() {

        List<DealerCar> cars = new ArrayList<DealerCar>();
        cars.add(new DealerCar(new Car("Volkswagen", "eU-golf", TRUE, 5000, 200, 3, 2015, FALSE, TRUE), 10000, 2));


        List<DealerCar> sortedCars = dealerService.quickSortHorsePower(cars);//creez o noua lista cu valorile sortate
        Assert.assertEquals(3, sortedCars.get(0).getCar().getHorsePower());
    }

    @Test
    public void quickSortHorsePower() {
        DealerCar dealerCar1 = new DealerCar(new Car("Volkswagen", "eU-golf", TRUE, 5000, 200, 3, 2015, FALSE, TRUE), 10000, 3);
        DealerCar dealerCar2 = new DealerCar(new Car("Volkswagen", "e-Golf", TRUE, 3000, 500, 4, 2017, TRUE, FALSE), 25000, 3);
        DealerCar dealerCar3 = new DealerCar(new Car("BMW", "i3", TRUE, 6000, 900, 5, 2018, TRUE, TRUE), 18000, 3);
        DealerCar dealerCar4 = new DealerCar(new Car("Kia", "Soul", FALSE, 4000, 400, 3, 2016, FALSE, TRUE), 7000, 3);

        List<DealerCar> dealerCars = new ArrayList<DealerCar>();
        dealerCars.add(dealerCar1);
        dealerCars.add(dealerCar2);
        dealerCars.add(dealerCar3);
        dealerCars.add(dealerCar4);

        List<DealerCar> sortedCars = dealerService.quickSortPrice(dealerCars);

        System.out.println(sortedCars);
        Assert.assertTrue(3 == sortedCars.get(0).getCar().getHorsePower());
        Assert.assertTrue(3 == sortedCars.get(1).getCar().getHorsePower());
        Assert.assertTrue(5 == sortedCars.get(2).getCar().getHorsePower());
        Assert.assertTrue(4 == sortedCars.get(3).getCar().getHorsePower());

    }
}
