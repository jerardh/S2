class Employee{
    int num;
    String name;
    float basicpay,da,ba,hra,salary;
    Employee(int num,String name,float basicpay){
        this.num=num;
        this.name=name;
        this.basicpay=basicpay;
        da=(5/100)*basicpay;
        hra=(3/100)*basicpay;
        ba=(5/100)*basicpay;
    }
    float getSalary(){
        salary=da+ba+hra+basicpay;
        return salary;
    }
}
public class EmployeeSalary {
    
}
