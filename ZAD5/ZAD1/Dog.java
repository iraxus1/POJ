package pl.edu.pja;

public class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }

    String MakeSound()
    {
        return "Woof Woof";
    }

    @Override
    public String toString() {
        return super.toString() + MakeSound();
    }
}
