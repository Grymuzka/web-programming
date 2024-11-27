package firsttask;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person implements Cloneable {

    private final String firstName;
    private final String lastName;;
    private final LocalDate birthDate;
    private final int height;
    private final float weight;
    private final Address address;

    public Person(String lastName, String firstName, LocalDate birthDate, int height, float weight, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }

    public int getAgeInYears() {
        LocalDate now = LocalDate.now();
        return Period.between(now, birthDate).getYears();
    }

    public boolean isOlderThan(int years) {
        return getAgeInYears() > years;
    }

    public float getBMI() {
        if (height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Wzrost i waga muszą być większe od zera.");
        }
        double heightInMeters = height / 100.0;
        return (float) (weight / (heightInMeters * heightInMeters));
    }

    @Override
    public String toString() {
        return "person.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", height=" + height +
                ", weight=" + weight +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return height == person.height
                && Float.compare(weight, person.weight) == 0
                && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(birthDate, person.birthDate)
                && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate, height, weight, address);
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported", e);
        }
    }
}
