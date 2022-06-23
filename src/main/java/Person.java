import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int yearOfBirth;
    private String placeOfBirth;
    private String placeOfResidence;

    public Person(String name, String surname, int yearOfBirth, String placeOfBirth, String placeOfResidence) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.placeOfResidence = placeOfResidence;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return yearOfBirth == person.yearOfBirth && name.equals(person.name) && surname.equals(person.surname) && placeOfBirth.equals(person.placeOfBirth) && placeOfResidence.equals(person.placeOfResidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, yearOfBirth, placeOfBirth, placeOfResidence);
    }
}
