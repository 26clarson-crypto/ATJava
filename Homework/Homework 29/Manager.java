/* Manager class
Used the internet to understand how to call the employee constructor */

public class Manager extends Employee {
    private double bonus;

    // Constructor
    public Manager(String name, double salary, double bonus) {
        super(name, salary);  // calls Employee(name, salary)
        this.bonus = bonus;
    }

    // Override to include bonus on top of salary
    @Override
    public double getAnnualIncome() {
        return getSalary() + bonus;  // getSalary() is inherited from Employee
    }
}