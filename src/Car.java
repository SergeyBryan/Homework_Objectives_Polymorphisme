
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Car {

    private String brand;
    private String model;
    private float engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();


    public Car(String brand, String model, float engineVolume) {

        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (brand == null) {
            this.brand = "Не указано";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "Не указано";
        } else {
            this.model = model;
        }
    }

    protected String getBrand() {
        return brand;
    }

    protected final void setBrand(String brand) {
        this.brand = brand;
    }

    protected String getModel() {
        return model;
    }

    protected final void setModel(String model) {
        this.model = model;
    }

    protected float getEngineVolume() {
        return engineVolume;
    }

    protected final void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }
    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }
    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    protected abstract void startMove();

    protected abstract void endMove();

    protected abstract void diagnostic();

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void repair();
}
