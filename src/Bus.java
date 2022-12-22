public class Bus extends Car implements Competing {

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Автобус " +
                "бренд = " + getBrand()  +
                ", модель = " + getModel()  +
                ", объем двигателя = " + getEngineVolume();
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
}
