public class TruckCar  extends  Car implements Competing{
    public TruckCar(String brand, String name, float engineVolume) {
        super(brand, name, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовая машина " + " "+ getBrand() +" "+getModel() + " делает Пит-Стоп" );
    }

    @Override
    public void bestLapTime() {
        float anyNumber = 2.0f;
        System.out.println("Грузовая машина " + " "+ getBrand() +" "+getModel() + " лучшее время круга:" + Math.round(200*Math.random()) * (anyNumber));
    }

    @Override
    public void maxSpeed() {
        float anyNumber = 100f;
        System.out.println("Грузовая машина " + " "+ getBrand() +" "+getModel()+" максимальная скорость: "  + " " +Math.round((100*Math.random()+anyNumber)));
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль " +
                "бренд = " + brand  +
                ", модель = " + model  +
                ", объем двигателя = " + engineVolume;
    }

    @Override
    protected void startMove() {
        System.out.println("Грузовая машина "+ getBrand() +" "+getModel() + " начинает движение");
    }

    @Override
    protected void endMove() {
        System.out.println("Грузовая машина " + getBrand() +" "+getModel()+ " заканчивает движение");
    }
}
