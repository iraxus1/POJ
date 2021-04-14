package pl.edu.pja;

public class Cat extends Animal{
    public Cat(String name, String color) {
        super(name, color);
    }

    String MakeSound()
    {
        return "Miau Miau";
    }

    @Override
    public String toString() {
        return super.toString() + MakeSound();
    }
}
