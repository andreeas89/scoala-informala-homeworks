package ro.siit.java10.evp;

public class Customer {
    private Address address;
    private String name;
    private long cnp;
    private int phoneNumber;
    private double sumOfMoney;

    public Customer(Address address, String name, long cnp, int phoneNumber, double sumOfMoney) {
        this.address = address;
        this.name = name;
        this.cnp = cnp;
        this.phoneNumber = phoneNumber;
        this.sumOfMoney = sumOfMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSumOfMoney() {
        return sumOfMoney;
    }

    public void setSumOfMoney(double sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
