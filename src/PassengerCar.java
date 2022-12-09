public class PassengerCar extends Car implements Competing {
    private TypeOfBody typeOfBody;

    public PassengerCar(String brand, String model, float engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
                "бренд = " + brand  +
                ", модель = " + model  +
                ", объем двигателя = " + engineVolume;
    }

    @Override
    protected void startMove() {
        System.out.println("Легковая машина " + getBrand() + " " + getModel() + " начинает движение");
    }

    @Override
    protected void endMove() {
        System.out.println("Легковая машина " + getBrand() + " " + getModel() + " заканчивает движение");
    }

    @Override
    protected void printAuto() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип авто "+ typeOfBody);
        }

    }
}
