import java.util.ArrayList;

public abstract class Driver<T extends Car> {
    private String name;
    private String drivingLicense;
    private int experience;
    private T car;
    private final ArrayList<Driver<?>> drivers = new ArrayList();

    public Driver(String name, int driverExperience, String drivingLicense) {
        if (name == null) {
            this.name = "не указано";
        } else {
            this.name = name;
        }
        if (driverExperience < 0) {
            this.experience = 0;
        } else {
            this.experience = driverExperience;
        }
        if (drivingLicense == null || drivingLicense.isEmpty() || drivingLicense.isBlank()) {
            this.drivingLicense = "Не указано";
        } else {
            this.drivingLicense = drivingLicense;
        }
    }

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        if (drivingLicense == null || drivingLicense.isBlank() || drivingLicense.isEmpty()) {
            throw new IllegalArgumentException("У водителя должна быть категория прав");
        }
        this.drivingLicense = drivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водитель " +
                getName()  +
                ", с лицензией: " + getDrivingLicense() +
                ", водительский стаж " + getExperience() + " лет.";
    }

    public void drive(T car) {
        System.out.println(getName() + " сел за руль " + car.toString() + " и будет участвовать в заезде.");
    }


    public void startMove() {
        System.out.println(getName() + " начал движение на транспорте " + car.getBrand() + " " + car.getModel());
    }

    public void stop() {
        System.out.println(getName() + " совершает остановку на транспорте " + car.getBrand() + " " + car.getModel());
    }

    public void refuel() {
        System.out.println(getName() + " начал заправлять " + car.getBrand() + " " + car.getModel());
    }

    public ArrayList<Driver<?>> getDrivers() {
        return drivers;
    }

}
