package pl.edu.pja;

public class main {
    public static void main(String[] args) {
        Doberman doberman = new Doberman("Max");
        doberman.bark();
        doberman.walk();
        SausageDog sausageDog = new SausageDog("Fifi");
        sausageDog.bark();
        sausageDog.walk();
    }
}
