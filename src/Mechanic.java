import java.util.ArrayList;

public class Mechanic<E extends Car> {
    private String firstName;
    private String lastName;
    private String company;
    private final ArrayList<Mechanic> mechanics = new ArrayList<>();

    public Mechanic(String name, String lastName, String company) {
        this.firstName = name;
        this.company = company;
        this.lastName = lastName;
    }



    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void repairCar(E e) {
        e.repair();
    }

    public void service(E e) {
        e.diagnostic();
    }


}
