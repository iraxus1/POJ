package pl.edu.pja;

public class Person {
    private final String firstname;
    private final String lastname;
    private int birthyera;

    public Person(final String firstname, final String lastname, final String birthyera) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.Data(firstname, lastname, birthyera);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthyear=" + birthyera +
                '}';
    }

    private void Data(final String firstname, final String lastname, final String birthyera) throws IllegalArgumentException
    {
        if(firstname == null || firstname.isEmpty())
        {
            throw new IllegalArgumentException("Field [firstname] cannot be empty ");
        }

        if(lastname == null || lastname.isEmpty())
        {
            throw new IllegalArgumentException("Field [lastname] cannot be empty ");
        }

        if(birthyera == null || birthyera.isEmpty())
        {
            throw new IllegalArgumentException("Field [birthyear] cannot be empty ");
        }

        try {
            this.birthyera = Integer.parseInt(birthyera);
        } catch (NumberFormatException e)
        {
            throw new IllegalArgumentException("Birthyear invalid format: " + this.birthyera);
        }
        if (this.birthyera < 1900 || this.birthyera > 2020)
        {
            throw new IllegalArgumentException("Field [birthyear] is incorrect: " + this.birthyera);
        }


    }
}
