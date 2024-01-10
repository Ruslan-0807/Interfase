package Employee;

public class Manager implements Employee {
    int amountHors;
    double price;

    public Manager(int amountHors, double price) {
        this.amountHors = amountHors;
        this.price = price;
    }

    @Override
    public double calculationSalary() {
        return this.amountHors * this.price;
    }
}
