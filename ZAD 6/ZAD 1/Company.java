package pl.edu.pja;

public class Company {
    private final Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }
    public double calculateDailyCost()
    {
        double cost = 0.0;
        for ( Employee employee : employees)
        {
            cost += employee.getDailySalary();
        }
        return cost;
    }
    public double calculateMonthlyCost()
    {
        return 20*calculateDailyCost();
    }
    public double calculateYearlyCost()
    {
        return 12*calculateMonthlyCost();
    }
}
