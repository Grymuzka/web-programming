package firsttask;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {

        Address address = new Address("Niekładzka", "Warszawa", "90-291");

        Person person1 = new Person("Alice", "Smith", LocalDate.of(1990, 5, 15), 167, 65.7f, address);
        Person person2 = new Person("Bob", "Johnson", LocalDate.of(1985, 3, 20), 198, 94.2f, address);
        Person person3 = new Person("Alice", "Smith", LocalDate.of(1990, 5, 15), 167, 65.7f, address);
        Person person4 = new Person("Charlie", "Brown", LocalDate.of(2000, 8, 10), 166, 56f, address);

        System.out.println("Obiekty Person:");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        System.out.println("\nPorównanie obiektów:");
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // false
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // true
        System.out.println("person1.equals(person4): " + person1.equals(person4)); // false

        Person clonedPerson = person1.clone();
        System.out.println("\nKlonowanie obiektu:");
        System.out.println("Oryginalny obiekt: " + person1);
        System.out.println("Sklonowany obiekt: " + clonedPerson);

        System.out.println("Czy klon jest równy oryginałowi? " + person1.equals(clonedPerson)); // true
        System.out.println("Czy klon to ten sam obiekt? " + (person1 == clonedPerson)); // false
    }
}
