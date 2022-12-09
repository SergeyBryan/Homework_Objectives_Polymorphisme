import java.util.Objects;

public class DriverD<D extends Bus & Competing> extends Driver {
    private static final String TYPEOFLICENSE = "D";

    public DriverD(String name, int driverExperience, boolean isDriverLicense) {
        super(name, driverExperience, isDriverLicense);
    }

    public void drive(Bus bus) {
        System.out.println("Водитель " + getName() + " сел за руль автобуса " + bus.toString()+ " и будет участвовать в заезде.");
    }

    @Override
    public String toString() {
        return super.toString() + " Категория водительских прав: " + TYPEOFLICENSE;
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
