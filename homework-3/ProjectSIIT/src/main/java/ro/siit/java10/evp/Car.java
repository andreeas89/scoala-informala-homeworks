package ro.siit.java10.evp;

public class Car {
    private String manufactor;
    private String model;
    private boolean electricMotor;
    private int electricBatteries;
    private int energyConsumption;
    private int horsePower;
    private int productionYear;
    private boolean isNew;
    private boolean fastCharging;


    public Car(String manufactor, String model, boolean electricMotor, int electricBatteries, int energyConsumption, int horsePower, int productionYear, boolean isNew, boolean fastCharging) {
        this.manufactor = manufactor;
        this.model = model;
        this.electricMotor = electricMotor;
        this.electricBatteries = electricBatteries;
        this.energyConsumption = energyConsumption;
        this.horsePower = horsePower;
        this.productionYear = productionYear;
        this.isNew = isNew;
        this.fastCharging = fastCharging;
    }

    public Car() {
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

    public boolean isElectricMotor() {
        return electricMotor;
    }

    public void setElectricMotor(boolean electricMotor) {
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

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isFastCharging() {
        return fastCharging;
    }

    public void setFastCharging(boolean fastCharging) {
        this.fastCharging = fastCharging;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufactor='" + manufactor + '\'' +
                ", model='" + model + '\'' +
                ", electricMotor=" + electricMotor +
                ", electricBatteries=" + electricBatteries +
                ", energyConsumption=" + energyConsumption +
                ", horsePower=" + horsePower +
                ", productionYear=" + productionYear +
                ", isNew='" + isNew + '\'' +
                ", fastCharging='" + fastCharging + '\'' +
                '}';
    }
}
