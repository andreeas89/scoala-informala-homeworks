package ro.siit.homeworkProject;

public class Customer {
    private String name;
    private long cnp;
    private  int phoneNumber;
    private double sumOfMoney;
    private Address address;

    public Customer(String name, long cnp, int phoneNumber, double sumOfMoney, Address address) {
        this.name = name;
        this.cnp = cnp;
        this.phoneNumber = phoneNumber;
        this.sumOfMoney = sumOfMoney;
        this.address = address;
    }
    Address adress = new Address("Roma", "Italy", 4524);
    Customer customer = new Customer("Jenna", 277121201, 0745445544, 40000, address);

    public  Customer getCustomer() {
        return customer;
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
