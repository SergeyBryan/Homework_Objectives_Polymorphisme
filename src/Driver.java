import java.util.Objects;

public abstract class Driver {
    private String name;
    private boolean isDriverLicense;
    private int driverExperience;

    public Driver(String name, int driverExperience, boolean isDriverLicense) {
        if (name == null) {
            this.name = "не указано";
        } else {
            this.name = name;
        }
        if (driverExperience < 0) {
            this.driverExperience = 0;
        } else {
            this.driverExperience = driverExperience;
        }
        this.isDriverLicense = isDriverLicense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriverLicense() {
        return isDriverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        isDriverLicense = driverLicense;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }

    @Override
    public String toString() {
        return "Водитель " +
                name + '\'' +
                ", с лицензией: " + ((isDriverLicense) ? "Да" : "нет") +
                ", водительский стаж " + driverExperience + " лет.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return isDriverLicense == driver.isDriverLicense && driverExperience == driver.driverExperience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isDriverLicense, driverExperience);
    }

    protected abstract void startMove();
    protected abstract void stop();

    protected abstract void refuel();
}
