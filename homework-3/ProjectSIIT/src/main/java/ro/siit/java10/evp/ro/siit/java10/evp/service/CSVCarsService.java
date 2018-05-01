package ro.siit.java10.evp.ro.siit.java10.evp.service;

import ro.siit.java10.evp.Car;
import ro.siit.java10.evp.DealerCar;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVCarsService {
    private static final String CARS_FILE = "src\\main\\resources\\CsvCars.csv";
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    //CSV file header
    private static final String FILE_HEADER = "manufactor, model, electricMotor, electricBatteries, energyConsumption, horsePower, productionYear, isNew, fastCharging, rangePerCharge, price, stock";
    //private DealerService dealerService;


  /*  public CSVCarsService(DealerService dealerService) {
        this.dealerService = dealerService;
    }*/

    public static List<DealerCar> initializeDealerCars() {
        List<DealerCar> cars = new ArrayList<DealerCar>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(CARS_FILE), "UTF-8"))) {

            String line;
            while ( reader.readLine() != null) {
                line = reader.readLine();
                System.out.println(line);
                String[] tokens = line.split(",");

                Car carsList = new Car(tokens[0], tokens[1]/*, Boolean.valueOf(tokens[2]), Integer.parseInt(tokens[3]),
                        Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), Integer.parseInt(tokens[6]), Boolean.valueOf(tokens[7]),
                        Boolean.valueOf(tokens[8]), Integer.parseInt(tokens[9])*/);
//                DealerCar car = new DealerCar(carsList, Double.parseDouble(tokens[1]), Integer.parseInt(tokens[2]));
                DealerCar car = new DealerCar(carsList, 2, 2);
//
//                cars.add(car);
                System.out.println(car);

            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return cars;
    }

    public static void writeInCSV() {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(CARS_FILE);

            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write a new student object list to the CSV file
            List<DealerCar> cars = DealerService.getCars();
            for (DealerCar car : cars) {
                fileWriter.append(String.valueOf(car.getCar().getManufactor()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(car.getCar().getModel());
                fileWriter.append(COMMA_DELIMITER);
                /*fileWriter.append(car.getCar().isElectricMotor());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(student.getAge()));*/
                fileWriter.append(NEW_LINE_SEPARATOR);
            }


            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }
}
