import java.util.Objects;

public class DriverC<C extends TruckCar & Competing> extends Driver {
    private static final String TYPEOFLICENSE = "C";

    public DriverC(String name, int driverExperience, boolean isDriverLicense) {
        super(name, driverExperience, isDriverLicense);
    }

    public void drive(TruckCar truckCar) {
        System.out.println("Водитель " + getName() + " управляет авто " + truckCar.toString() + " и будет участвовать в заезде.");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + " Категория водительских прав: " + TYPEOFLICENSE;
    }

    @Override
    protected void startMove() {
        System.out.println("Водитель " + getName() + " начал движение");
    }

    @Override
    protected void stop() {
        System.out.println("Водитель " + getName() + " остановился");
    }

    @Override
    protected void refuel() {
        System.out.println("Водитель " + getName() + " заправил авто");
    }
}
