package ro.siit.homeworkProject;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String manufactor;
    private String model;
    private String electricMotor;
    private int electricBatteries;
    private int energyConsumption;
    private int horsePower;
    private int productionYear;
    private int stockNumber;
    private double price;
    private String newOrUse;

    public Car(String manufactor, String model, String electricMotor, int electricBatteries, int energyConsumption, int horsePower, int productionYear, int stockNumber, double price, String newOrUse) {
        this.manufactor = manufactor;
        this.model = model;
        this.electricMotor = electricMotor;
        this.electricBatteries = electricBatteries;
        this.energyConsumption = energyConsumption;
        this.horsePower = horsePower;
        this.productionYear = productionYear;
        this.stockNumber = stockNumber;
        this.price = price;
        this.newOrUse = newOrUse;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getElectricMotor() {
        return electricMotor;
    }

    public void setElectricMotor(String electricMotor) {
        this.electricMotor = electricMotor;
    }

    public int getElectricBatteries() {
        return electricBatteries;
    }

    public void setElectricBatteries(int electricBatteries) {
        this.electricBatteries = electricBatteries;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNewOrUse() {
        return newOrUse;
    }

    public void setNewOrUse(String newOrUse) {
        this.newOrUse = newOrUse;
    }
}
