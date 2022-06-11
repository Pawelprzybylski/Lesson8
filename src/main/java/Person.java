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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
