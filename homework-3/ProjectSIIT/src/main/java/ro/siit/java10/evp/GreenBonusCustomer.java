package ro.siit.java10.evp;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GreenBonusCustomer {
    private String name;
    private String dealerName;
    private String modelCar;

    public GreenBonusCustomer(String name, String dealerName, String modelCar) {
        this.name = name;
        this.dealerName = dealerName;
        this.modelCar = modelCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }


}
