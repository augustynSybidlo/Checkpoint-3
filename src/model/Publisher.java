package model;

public class Publisher extends Person {

    private String name;

    public Publisher(int id, String city, String country, String name) {
        super(id, city, country);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Publisher name: '%s' \n city: '%s' \n country: '%s' \n id: %d",
                name, getCity(), getCountry(), getId());
    }
}
