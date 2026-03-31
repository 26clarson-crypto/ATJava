/* Chloe Larson
Part B
used the internet to understand how to call the classes and override methods */

public class Main {
    public static void main(String[] args) {
        // Create an Employee
        Employee emp = new Employee("Alice", 50000);

        // Create a Manager
        Manager mgr = new Manager("Bob", 50000, 10000);

        // Print their info
        System.out.println ();

        System.out.println("Employee: " + emp.getName());
        System.out.println("Annual Income: $" + emp.getAnnualIncome());

        System.out.println();

        System.out.println("Manager: " + mgr.getName());
        System.out.println("Annual Income: $" + mgr.getAnnualIncome());
    }
}
/*  
Output will look like: this is an EXAMPLE to show code works. 
```
Employee: Alice
Annual Income: $50000.0

Manager: Bob
Annual Income: $60000.0
*/