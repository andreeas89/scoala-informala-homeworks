package ro.siit.java10.evp;

public class DealerCar {
    private Car car;
    private double price;
    private int stock;

    public DealerCar(Car car, double price, int stock) {
        this.car = car;
        this.price = price;
        this.stock = stock;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "DealerCar{" +
                "car=" + car +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
