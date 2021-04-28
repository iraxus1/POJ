package pl.edu.pja;

public class Local {
    private final String name;
    private final String street;
    private final String city;
    private final String postalcode;
    private final String housenumberorlocalnumber;


    public Local(String name, String street, String city, String postalcode, String housenumberorlocalnumber) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.postalcode = postalcode;
        this.housenumberorlocalnumber = housenumberorlocalnumber;

    }

    @Override
    public String toString() {
        return   name +'\n' +
                "City: " + city + '\n' +
                "Postalcode: " + postalcode + '\n' +
                "Street: " + street + '\n' +
                "House/Local: " + housenumberorlocalnumber + '\n';
    }
}
