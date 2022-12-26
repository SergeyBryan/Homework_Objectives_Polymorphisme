import java.util.ArrayList;

public class Sponsor {
    public String name;
    public int money;
    public final ArrayList <Car> sponsors = new ArrayList<>();

    public Sponsor(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sponsoring() {
        System.out.printf(getName() + " спонсирует заезд на %d%f", money);
    }

    public ArrayList<Car> getSponsors() {
        return sponsors;
    }

}
