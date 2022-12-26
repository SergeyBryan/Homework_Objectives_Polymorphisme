import java.util.LinkedList;
import java.util.Queue;

public class StationOfService<T extends Car>{
    private String name;

    public StationOfService(String name) {
        this.name = name;
    }

    private Queue<Car> queue= new LinkedList<>();

    public void addCar(Car car) {
    queue.offer(car);
    }
    public void treat() {
        Car car = queue.poll();
        if (car != null) {
            System.out.println(car + " был отремонтирован.");
        }
    }

    public int queueSize() {
        return queue.size();
    }


}



