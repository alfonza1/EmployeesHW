package labs.employees;

public class Main {


    public static void main(String[] args) {
        Person employee1 = new SalaryEmployee("Alfonza Jones",1000000);
        System.out.println(employee1);
        Person employee2 = new HourlyEmployee("Alfonzas Imaginary Son",40,65.0);
        System.out.println(employee2);
        System.out.println(employee2.calculatePay());
    }
}
