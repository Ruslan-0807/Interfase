package Employee;

public class Programmer implements Employee{
   int amountHors;
   double price;

    public Programmer(int amountHors, double price) {
        this.amountHors = amountHors;
        this.price = price;
    }
    @Override
    public double calculationSalary(){
        return this.amountHors * this.price;
    }
}
