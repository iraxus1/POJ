package pl.edu.pja;

public abstract class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public abstract void bark();

    public String getName() {
        return name;
    }

    public abstract void walk();
}
