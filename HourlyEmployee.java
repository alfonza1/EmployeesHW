package labs.employees;

public class HourlyEmployee extends Employees {
    private int hoursWorked;
    private double rate;
   private String name;

    public HourlyEmployee(String name,int hoursWorked, double rate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.rate = rate;
        this.name = name;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * rate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hoursWorked=" + hoursWorked +
                ", rate=" + rate +
                ", name='" + name + '\'' +
                '}';
    }
}

