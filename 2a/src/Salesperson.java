public class Salesperson extends Employee {
    double commissionPercentage;

    // Constructor
    public Salesperson(String name, int id, double salary, double commissionPercentage) {
        super(name, id, salary); // Calls the constructor of Employee
        this.commissionPercentage = commissionPercentage;
    }
}
