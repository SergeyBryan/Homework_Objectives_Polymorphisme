public class Bus extends Car implements Competing {

    private Capacity capacity;

    public Bus(String brand, String model, float engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Автобус " +
                "бренд = " + brand  +
                ", модель = " + model  +
                ", объем двигателя = " + engineVolume;
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " делает Пит-Стоп");

    }

    @Override
    public void bestLapTime() {
        float anyNumber = 2f;
        System.out.println("Автобус " + getBrand() + " " + getModel() + " лучшее время круга:" + Math.round(200 * Math.random()) * (anyNumber));
    }

    @Override
    public void maxSpeed() {
        float anyNumber = 50.0f;
        System.out.println("Автобус " + " " + getBrand() + " " + getModel() + " максимальная скорость: " + Math.round((100 * Math.random() + anyNumber)));
    }

    @Override
    protected void startMove() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начинает движение");
    }

    @Override
    protected void endMove() {
        System.out.println(getBrand() + " " + getModel() + " заканчивает движение");
    }

    @Override
    protected void printAuto() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom() + " до "+ capacity.getTo());
        }
    }
}


