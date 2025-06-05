
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Business System");


        Employee manager = new Manager(1, "Ehab Mekky", 30000, 50000);
        Employee salesPerson = new SalesPerson(2, "Hazem Gamal", 15000, 30000);
        Employee intern = new Intern(3, "Amr Mahrus", 3000);

        System.out.println("=== Manager ===");
        manager.displayInfo();
        System.out.println("Total Salary: $" + manager.calculateSalary());

        System.out.println("\n=== Sales Person ===");
        salesPerson.displayInfo();
        System.out.println("Total Salary: $" + salesPerson.calculateSalary());

        System.out.println("\n=== Intern ===");
        intern.displayInfo();
        System.out.println("Total Salary: $" + intern.calculateSalary());


        System.out.println("\n=== Monthly Payroll Calculation ===");
        Employee[] employees = {manager, salesPerson, intern};
        double totalPayroll = 0;

        for (Employee emp : employees) {
            totalPayroll += emp.calculateSalary();
            System.out.println(emp.getName() + ": $" + emp.calculateSalary());
        }

        System.out.println("Total Monthly Payroll: $" + totalPayroll);
    }
}