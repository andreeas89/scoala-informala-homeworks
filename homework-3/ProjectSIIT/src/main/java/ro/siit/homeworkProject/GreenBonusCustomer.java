package ro.siit.homeworkProject;

import ro.siit.homeworkProject.ro.siit.homeworkProject.service.DealerService;
import ro.siit.homeworkProject.ro.siit.homeworkProject.service.GreenBonusProgramService;

import java.util.List;

public class GreenBonusCustomer {
    private String name;
    private String dealerName;
    private String modelCar;

    //GreenBonusProgramService obj = new GreenBonusProgramService();
    //GreenBonusProgram gb = new GreenBonusProgram(12, obj.getListCustomer());

    public void addCustomer(List customer ,String name, String dealerName, String modelCar) {
        customer.add(new GreenBonusCustomer());
    }
    public int getNumberCustomer(){
        return 1;//gb.getNumberCars();
    }

}
