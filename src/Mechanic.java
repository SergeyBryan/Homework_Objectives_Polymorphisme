import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(firstName, mechanic.firstName) && Objects.equals(lastName, mechanic.lastName) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company);
    }

    @Override
    public String toString() {
        return "Механик " +
                firstName +
                " " + lastName  +
                ", из компании " + company;
    }
}
