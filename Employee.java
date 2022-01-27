package day13;

public class Employee {

    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double reverse(double a) {
        a = a * 2;
        return a;

    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("ivan", 100.44);
        double d = emp1.reverse(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
    }


}



