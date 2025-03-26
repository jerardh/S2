import java.util.Scanner;
class Employee {
    int num;
    String name;
    double basicpay, da, ba, hra, salary;
    Employee(int num, String name, double basicpay) {
        this.num = num;
        this.name = name;
        this.basicpay = basicpay;
        da = (0.05) * basicpay;
        hra = (0.03) * basicpay;
        ba = (0.05) * basicpay;
    }
    void getSalary() {
        salary = da + ba + hra + basicpay;
    }
    void display() {
        getSalary();
        System.out.println("Id:" + num);
        System.out.println("Name:" + name);
        System.out.println("Basic Pay:" + basicpay);
        System.out.println("DA:" + da);
        System.out.println("BA:" + ba);
        System.out.println("HRA:" + hra);
        System.out.println("NET Salary:" + salary);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the employee id:");
        int id = s1.nextInt();
        System.out.println("Enter employee name");
        String name = s1.next();
        System.out.println("Enter employee basic pay");
        double basicpay = s1.nextDouble();
        Employee employee = new Employee(id, name, basicpay);
        employee.display();
    }
}
