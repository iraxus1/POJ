package pl.edu.pja;

public class SausageDog extends Dog{
    public SausageDog(final String name) {
        super(name);
    }

    @Override
    public void bark()
    {
        System.out.println("Hau Hau");
    }

    @Override
    public void walk()
    {
        System.out.println("Sausagedog walks");
    }
}
