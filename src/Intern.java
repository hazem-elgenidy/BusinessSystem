public class Intern extends Employee {

    private int id;
    private String name;
    private static final double FIXED_SALARY = 3000;

    public Intern(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }


    @Override
    public double calculateSalary() {
        return  FIXED_SALARY;
    }
}