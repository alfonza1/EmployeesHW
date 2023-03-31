package labs.employees;

public class SalaryEmployee extends Employees {
    private double salary;
    private String name;
    private int id;

    public SalaryEmployee(String name,double salary) {
        super(name);
        this.salary = salary;
        this.name = name;
        this.id = getId();
    }
    @Override
    public double calculatePay() {
        return salary;
    }


    @Override
    public String toString() {
        return "SalaryEmployee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
