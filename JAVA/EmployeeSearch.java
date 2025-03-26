import java.util.Scanner;

class Employee {
    int id;
    String name;
    float salary;

    Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
    }

    // search id for employee
    public int getId() {
        return id;
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
        int n;
        // array of objects
        Employee[] employees;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        n = s1.nextInt();
        // initialization
        employees = new Employee[n];
        // reading elements
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + i);
            System.out.println("Enter id:");
            int id = s1.nextInt();
            System.out.println("Enter name:");
            String name = s1.next();
            System.out.println("Enter Salary:");
            float salary = s1.nextFloat();
            employees[i] = new Employee(id, name, salary);
        }
        System.out.println("Enter the id of the employee to be searched");
        int eid = s1.nextInt();
        boolean flag = false;
        for (Employee employee : employees) {
            if (employee.getId() == eid) {
                employee.display();
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Employee not present");
        }
    }
}
