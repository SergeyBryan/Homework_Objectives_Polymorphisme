import Data.Data;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mechanic first = new Mechanic("Василий", "Портнов", "Pepsi");
        Mechanic second = new Mechanic("Петя", "Васильев", "Pepsi");
        Sponsor s2 = new Sponsor("Fagel", 22500);
        Sponsor s3 = new Sponsor("Pepsi", 225000000);
        DriverB b1 = new DriverB("Горелов Василий Петрович", 2);
        DriverC c1 = new DriverC("Мамедов Иван Васильевич", 5);
        DriverD d1 = new DriverD("Королев Игорь Владиславович", 11);
        Bus[] buses = {
                new Bus("Liaz", "2013", 2.5f),
                new Bus("Liaz", "2015", 3.5f),
                new Bus("Liaz", "2021", 4.5f),
                new Bus("Liaz", "2022", 5.5f)};
        buses[0].addDriver(c1);
        buses[0].addMechanic(first);
        buses[0].addSponsor(s2, s3);
        PassengerCar[] passengerCars = {
                new PassengerCar("Audi", "A8", 4f),
                new PassengerCar("BMW", "X6", 3f),
                new PassengerCar("Mercedes", "GLE", 2.9f),
                new PassengerCar("Volkswagen", "Polo", 1.6f)
        };
        passengerCars[0].addDriver(b1);
        passengerCars[0].addMechanic(second);
        passengerCars[0].addSponsor(s2);
        passengerCars[0].addSponsor(s3);
        passengerCars[1].addMechanic(second);
        passengerCars[1].addSponsor(s3);
        TruckCar[] truckCars = {
                new TruckCar("Volvo", "D12", 12.1f),
                new TruckCar("Ford", "F150", 3.3f),
                new TruckCar("Ford", "Transit", 3.5f),
                new TruckCar("Chevrolet", "Express", 2.2f)
        };
        for (int i = 0; i < buses.length; i++) {
            buses[i].startMove();
            buses[i].pitStop();
            buses[i].startMove();
            buses[i].endMove();
            buses[i].bestLapTime();
            buses[i].maxSpeed();
        }
        for (int i = 0; i < passengerCars.length; i++) {
            passengerCars[i].startMove();
            passengerCars[i].pitStop();
            passengerCars[i].startMove();
            passengerCars[i].bestLapTime();
            passengerCars[i].maxSpeed();
        }
        for (int i = 0; i < truckCars.length; i++) {
            truckCars[i].startMove();
            truckCars[i].pitStop();
            truckCars[i].startMove();
            truckCars[i].bestLapTime();
            truckCars[i].maxSpeed();
        }
        System.out.println(b1.toString());
        System.out.println(c1.toString());
        System.out.println(d1.toString());
        c1.drive(truckCars[2]);
        b1.drive(passengerCars[3]);
        System.out.println(passengerCars[0].getBrand());
        for (int i = 0; i < passengerCars.length ; i++) {
            passengerCars[i].diagnostic();
        }
        for (int i = 0; i < truckCars.length ; i++) {
            truckCars[i].diagnostic();
        }
        for (int i = 0; i < buses.length ; i++) {
            buses[i].diagnostic();
        }
        List<Car> cars = List.of(buses[0],buses[1],buses[2],buses[3],
                truckCars[0],truckCars[1],truckCars[2],truckCars[3],
                passengerCars[0],passengerCars[1],passengerCars[2],passengerCars[3]);
        System.out.println(cars.toString());
        StationOfService<TruckCar> firstStation = new StationOfService<>("Станция для грузовых");
        firstStation.addCar(truckCars[0]);
        firstStation.addCar(truckCars[1]);
        firstStation.addCar(truckCars[2]);
        firstStation.addCar(truckCars[3]);
        firstStation.treat();
        System.out.println(firstStation.queueSize());
        firstStation.treat();
        System.out.println(firstStation.queueSize());
        firstStation.treat();
        firstStation.treat();
        System.out.println(firstStation.queueSize());
        printInfo(buses);
        printInfo(passengerCars);
        printInfo(truckCars);
    }
    public static void printInfo(Car[] car) {
        for (int i = 0; i < car.length ; i++) {
            System.out.println(car[i].getBrand() + " " + car[i].getModel());
            System.out.println("Водители: " );
            for (Driver<?> driver : car[i].getDrivers()) {
                System.out.println(driver.getName());
            }
            System.out.println("Спонсоры: ");
            for (Sponsor sponsor : car[i].getSponsors()) {
                System.out.println(sponsor.name);
            }
            System.out.println("Механики: ");
            for (Mechanic<?> mechanic : car[i].getMechanics()) {
                System.out.println(mechanic.getFirstName() + " " + mechanic.getLastName());
            }
        }
    }
}