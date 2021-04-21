package pl.edu.pja;

public class Main {
    public static void main(String[] args) {
        final Employee[] employees = {
                new Employee("Adam","Mickiewicz",700),
                new Employee("Juliusz","Słowacki",300),
                new Employee("Maria","Konopnicka",750),
        };

        final Company company = new Company(employees);

        System.out.println("Daily cost: " + company.calculateDailyCost());
        System.out.println("Monthly cost: " + company.calculateMonthlyCost());
        System.out.println("Yearly cost: " + company.calculateYearlyCost());
    }
}
