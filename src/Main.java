import Data.Data;
import Product.Product;
import Product.Recipes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Mechanic vasiliy = new Mechanic("Василий", "Портнов", "Pepsi");
        Mechanic pety = new Mechanic("Петя", "Васильев", "Adidas");
        Mechanic ivan = new Mechanic("Иван", "Федорович", "Red Bull");
        Mechanic michael = new Mechanic("Михаэль", "Шумахер", "Danone");
        Mechanic lewis = new Mechanic("Левис", "Хамильтон", "Nestle");
        Mechanic juan = new Mechanic("Хуан", "Мануэль", "Coca-Cola");
        Sponsor s1 = new Sponsor("James Bond", 22500);
        Sponsor s2 = new Sponsor("Pepsi", 225000000);
        Sponsor s3 = new Sponsor("krasny oktyabr", 3450000);
        Sponsor s4 = new Sponsor("Michelin", 500000);
        Sponsor s5 = new Sponsor("Alpen Gold", 1000000);
        DriverB b1 = new DriverB("Горелов Василий Петрович", 2);
        DriverB b2 = new DriverB("Мамедов Петя Петрович", 2);
        DriverB b3 = new DriverB("Иванов Василий Петрович", 2);
        DriverB b4 = new DriverB("Горюнов Василий Иванов", 2);
        DriverC c1 = new DriverC("Мамедов Иван Васильевич", 5);
        DriverC c2 = new DriverC("Вавилов Дмитрий Дмитриевич", 5);
        DriverC c3 = new DriverC("Абрамович Георгий Васильевич", 5);
        DriverC c4 = new DriverC("Портнов Александр Васильевич", 5);
        DriverD d1 = new DriverD("Королев Игорь Владиславович", 11);
        DriverD d2 = new DriverD("Богатырев Иван Иванович", 11);
        DriverD d3 = new DriverD("Цветнов Роман Владиславович", 11);
        DriverD d4 = new DriverD("Горелов Игорь Владиславович", 11);
        Bus[] buses = {
                new Bus("Liaz", "2013", 2.5f),
                new Bus("Liaz", "2015", 3.5f),
                new Bus("Liaz", "2021", 4.5f),
                new Bus("Liaz", "2022", 5.5f)};
        buses[0].addDriver(c1);
        buses[1].addDriver(c2);
        buses[2].addDriver(c3);
        buses[3].addDriver(c4);
        buses[0].addSponsor(s2, s3);
        buses[1].addSponsor(s1);
        buses[2].addSponsor(s4);
        buses[3].addSponsor(s5);
        buses[0].addMechanic(vasiliy);
        buses[1].addMechanic(pety);
        buses[2].addMechanic(ivan);
        buses[3].addMechanic(lewis);
        PassengerCar[] passengerCars = {
                new PassengerCar("Audi", "A8", 4f),
                new PassengerCar("BMW", "X6", 3f),
                new PassengerCar("Mercedes", "GLE", 2.9f),
                new PassengerCar("Volkswagen", "Polo", 1.6f)
        };
        passengerCars[0].addDriver(b1);
        passengerCars[1].addDriver(b2);
        passengerCars[2].addDriver(b3);
        passengerCars[3].addDriver(b4);
        passengerCars[0].addMechanic(michael);
        passengerCars[1].addMechanic(pety, michael);
        passengerCars[2].addMechanic(juan);
        passengerCars[3].addMechanic(juan, michael);
        passengerCars[0].addSponsor(s2, s3);
        passengerCars[1].addSponsor(s5);
        passengerCars[2].addSponsor(s3);
        passengerCars[3].addSponsor(s3);
        TruckCar[] truckCars = {
                new TruckCar("Volvo", "D12", 12.1f),
                new TruckCar("Ford", "F150", 3.3f),
                new TruckCar("Ford", "Transit", 3.5f),
                new TruckCar("Chevrolet", "Express", 2.2f)
        };
        truckCars[0].addDriver(c1);
        truckCars[1].addDriver(c2);
        truckCars[2].addDriver(c3);
        truckCars[3].addDriver(c4);
        truckCars[0].addMechanic(michael);
        truckCars[1].addMechanic(pety, michael);
        truckCars[2].addMechanic(juan);
        truckCars[3].addMechanic(juan, michael);
        truckCars[0].addSponsor(s2, s3);
        truckCars[1].addSponsor(s5);
        truckCars[2].addSponsor(s3);
        truckCars[3].addSponsor(s3, s4, s5, s1);
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
        for (int i = 0; i < passengerCars.length; i++) {
            passengerCars[i].diagnostic();
        }
        for (int i = 0; i < truckCars.length; i++) {
            truckCars[i].diagnostic();
        }
        for (int i = 0; i < buses.length; i++) {
            buses[i].diagnostic();
        }
        List<Car> cars = List.of(buses[0], buses[1], buses[2], buses[3],
                truckCars[0], truckCars[1], truckCars[2], truckCars[3],
                passengerCars[0], passengerCars[1], passengerCars[2], passengerCars[3]);
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
        System.out.println(buses[0].getMechanics());
        printInfo(buses);
        printInfo(passengerCars);
        printInfo(truckCars);

//      Задание 1
        Product bananas = new Product("Бананы", 149, 2);
        Product orange = new Product("Апельсины", 150, 4);
        Product potates = new Product("Картошка", 160, 2);
        Product cucumbers = new Product("Огурцы", 110, 2);
        Product sugar = new Product("Сахар", 110, 2);
        Product cheese = new Product("Сыр", 110, 2);
        Product carrot = new Product("Морковь", 95, 2);
        Product sausage = new Product("Колбаса", 200, 0.5);
        Product olives = new Product("Оливки", 110, 0.3);
        Product chicken = new Product("Курица", 210, 1);
        Product lettuce = new Product("Салат", 125, 0.1);
        Product pepper = new Product("Перец", 150, 1);
        Product tomates = new Product("Помидоры", 210, 1);
        Set<Product> basket = new HashSet<>();
        bananas.addProductsInBusket(basket);
        orange.addProductsInBusket(basket);
        cucumbers.addProductsInBusket(basket);
        sugar.addProductsInBusket(basket);
        cheese.addProductsInBusket(basket);
        potates.addProductsInBusket(basket);
        System.out.println(Arrays.toString(basket.toArray()));

        basket.remove(bananas);
        System.out.println(basket.toString());
//       Задание 2.1
        Set<Recipes> allRecipe = new HashSet<>();
        Recipes olivieSalad = new Recipes("Салат Оливье");
        Recipes vegetableSalad = new Recipes("Овощной салат");
        Recipes caesar = new Recipes("Салат цезарь");
        System.out.println(caesar.toString());
        olivieSalad.addRecipeInSet(allRecipe);
        olivieSalad.addProductsInRecipes(potates, cucumbers, carrot, sausage);
        vegetableSalad.addRecipeInSet(allRecipe);
        vegetableSalad.addProductsInRecipes(cucumbers, pepper, olives, tomates);
        caesar.addRecipeInSet(allRecipe);
        caesar.addProductsInRecipes(chicken, lettuce, tomates, cheese);
        System.out.println(allRecipe.toString());
//        Задание 2.2
        Set<Integer> intengerSet = new HashSet<>();
        for (int i = 0; i < 21; i++) {
            intengerSet.add((int) (Math.random() * 1000) + 1);
        }
        System.out.println(intengerSet.toString());
        intengerSet.removeIf(integer -> integer % 2 != 0);
        System.out.println(intengerSet.toString());
    }
//    Задание 3.
    
    public static void printInfo(Car[] car) {
            for (Car cars : car) {
                System.out.println(cars.getBrand() + " " + cars.getModel());
                System.out.println("Водители: ");
                System.out.println(cars.getDrivers());
                System.out.println("Спонсоры: ");
                System.out.println(cars.getSponsors());
                System.out.println("Механики: ");
                System.out.println(cars.getMechanics());
            }
        }
}