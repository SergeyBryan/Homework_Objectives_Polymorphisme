public class PassengerCar extends Car implements Competing {
    public PassengerCar(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void pitStop() {
        System.out.println("Легковая машина " + " " + getBrand() + " " + getModel() + " делает Пит-Стоп");
    }

    @Override
    public void bestLapTime() {
        float anyNumber = 2.0f;
        System.out.println("Легковая машина " + " " + getBrand() + " " + getModel() + " лучшее время круга:" + Math.round(200 * Math.random()) * (anyNumber));
    }

    @Override
    public void maxSpeed() {
        float anyNumber = 150f;
        System.out.println("Легковая машина " + " " + getBrand() + " " + getModel() + " максимальная скорость: " + " " + Math.round((100 * Math.random() + anyNumber)));
    }

    @Override
    public String toString() {
        return "Легковой автомобиль " +
                "бренд = " + getBrand() +
                ", модель = " + getModel() +
                ", объем двигателя = " + getEngineVolume();
    }

    @Override
    protected void startMove() {
        System.out.println("Легковая машина " + getBrand() + " " + getModel() + " начинает движение");
    }

    @Override
    protected void endMove() {
        System.out.println("Легковая машина " + getBrand() + " " + getModel() + " заканчивает движение");
    }
}
