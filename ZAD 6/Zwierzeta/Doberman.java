package pl.edu.pja;

public class Doberman extends Dog{
    public Doberman(final String name)
    {
        super(name);
    }

    @Override
    public void bark ()
    {
        System.out.println("woof woof");
    }

    @Override
    public void walk()
    {
        System.out.println("Doberman walks");
    }
}
