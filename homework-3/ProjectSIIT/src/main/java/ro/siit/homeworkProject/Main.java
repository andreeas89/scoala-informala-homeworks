package ro.siit.homeworkProject;

import ro.siit.homeworkProject.ro.siit.homeworkProject.service.GreenBonusProgramService;

public class Main {
    public static void main(String[] args) {

        GreenBonusProgramService obj = new GreenBonusProgramService();
        GreenBonusProgram g = new GreenBonusProgram(10, obj.getListCustomer());
        System.out.println(g.getNumberCars());

    }
}
