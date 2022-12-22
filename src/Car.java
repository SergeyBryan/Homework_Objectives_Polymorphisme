
import java.util.Objects;

public abstract class Car {

    private String brand;
    private String model;
    private float engineVolume;


    protected Car(String brand, String model, float engineVolume) {

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


}
