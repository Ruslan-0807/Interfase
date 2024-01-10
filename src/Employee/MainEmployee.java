package Employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
                new Programmer(80, 25),
                new Programmer(80, 25),
                new Programmer(80, 25),
        new Manager(75, 25),
        new Manager(75, 25),
        new Manager(75, 25),
};


            Employee maxEmployee = employees[0];
            double maxSalary = maxEmployee.calculationSalary();
            for (Employee employee : employees) {
                if (employee.calculationSalary() > maxSalary){
                    maxEmployee = employee;
                    maxSalary = employee.calculationSalary();
        }
        }
        System.out.println();
            maxEmployee.calculationSalary();
    }
}
