package pl.edu.pja;

public class Employee {
    private final String name;
    private final String surname;
    private final double dailySalary;

    public Employee(String name, String surname, double dailySalary) {
        this.name = name;
        this.surname = surname;
        this.dailySalary = dailySalary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getDailySalary() {
        return dailySalary;
    }
}
