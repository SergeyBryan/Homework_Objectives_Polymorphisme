public class TruckCar  extends  Car implements Competing{
    private Weight weight;
    public TruckCar(String brand, String name, float engineVolume, Weight weight) {
        super(brand, name, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
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

    @Override
    protected void printAuto() {
        if (weight == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = weight.getFrom()==null? "" : " от" + weight.getFrom() + " ";
            String to = weight.getTo()==null? "" : "до" + weight.getTo();
            System.out.println("Вес автомобиля " + from + to);
        }

    }
}
