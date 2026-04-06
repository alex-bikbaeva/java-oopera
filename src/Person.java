public class Person {
    private String name;
    private String surname;
    private Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
