package pl.edu.pja;

public class Main {
    public static void main(String[] args) {
        ATM machine = new ATM(10);
        machine.setUsers();
        machine.switchATM();
    }
}

