import java.util.Scanner;

class Employee {
    protected int id;
    protected String name;
    protected double salary;
    protected String address;

    Employee(int id, String name, double salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    String dept;
    int subjectcode;
    String subjectName;

    Teacher(int id, String name, double salary, String address, String dept, int scode, String sname) {
        super(id, name, salary, address);
        this.dept = dept;
        this.subjectcode = scode;
        this.subjectName = sname;
    }

    void display() {
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
        System.out.println("Address:" + address);
        System.out.println("Department:" + dept);
        System.out.println("Subject Code:" + subjectcode);
        System.out.println("Subject Name:" + subjectName);
    }

}

public class TeacherEmployee {
    public static void main(String[] args) {
        int n;
        Teacher[] teachers;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number of teachers");
        n = s1.nextInt();
        teachers = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Teacher " + i);
            System.out.println("Enter Id:");
            int id = s1.nextInt();
            System.out.println("Enter Name:");
            String name = s1.next();
            System.out.println("Enter Salary:");
            double salary = s1.nextDouble();
            System.out.println("Enter Address:");
            String address = s1.next();
            System.out.println("Enter Department name:");
            String dept = s1.next();
            System.out.println("Enter Subject Code:");
            int scode = s1.nextInt();
            System.out.println("Enter Subject Name:");
            String sname = s1.next();
            teachers[i] = new Teacher(id, name, salary, address, dept, scode, sname);
        }
        System.out.println("Teacher Info");
        for (Teacher teacher : teachers) {
            teacher.display();
        }
    }
}
