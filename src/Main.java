public class Main {
    public static void main(String[] args) {
        Bus[] buses = {
                new Bus("Liaz", "2013", 2.5f),
                new Bus("Liaz", "2015", 3.5f),
                new Bus("Liaz", "2021", 4.5f),
                new Bus("Liaz", "2022", 5.5f)};

        PassengerCar[] passengerCars = {
                new PassengerCar("Audi", "A8", 4f),
                new PassengerCar("BMW", "X6", 3f),
                new PassengerCar("Mercedes", "GLE", 2.9f),
                new PassengerCar("Volkswagen", "Polo", 1.6f)
        };
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
        DriverB b1 = new DriverB("Горелов Василий Петрович", 2, true);
        DriverC c1 = new DriverC("Мамедов Иван Васильевич", 5, true);
        DriverD d1 = new DriverD("Королев Игорь Владиславович", 11, true);
        System.out.println(b1.toString());
        System.out.println(c1.toString());
        System.out.println(d1.toString());
        b1.stop();
        c1.startMove();
        d1.refuel();
        c1.drive(truckCars[2]);
        b1.drive(passengerCars[3]);
        d1.drive(buses[0]);
    }


}