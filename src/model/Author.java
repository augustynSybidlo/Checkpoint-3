package model;

public class Author extends Person {

    private String name;
    private String surname;
    private int birthdate;

    public Author(int id, String city, String country, String name, String surname, int birthdate) {
        super(id, city, country);
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return String.format("Author name: '%s'\n surname:'%s'\n birthdate: %d\n city: %s\n country: %s",
                name, surname, birthdate, getCity(), getCountry());
    }
}
