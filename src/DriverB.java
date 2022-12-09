
public class DriverB<B extends PassengerCar & Competing> extends Driver {
    private static final String TYPEOFLICENSE = "B";

    public DriverB(String name, int driverExperience, boolean isDriverLicense) {
        super(name, driverExperience, isDriverLicense);
    }

    public void drive(PassengerCar passengerCar) {
        System.out.println(getName() + " сел за руль " + passengerCar.toString()+ " и будет участвовать в заезде.");
    }

    @Override
    public String toString() {
        return super.toString() + " Категория водительских прав: " + TYPEOFLICENSE;
    }

    @Override
    protected void refuel() {
        System.out.println("Водитель " + getName() + " заправил авто");
    }

    @Override
    protected void stop() {
        System.out.println("Водитель " + getName() + " остановился");
    }

    @Override
    protected void startMove() {
        System.out.println("Водитель " + getName() + " начал движение");
    }
}
