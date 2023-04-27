import java.util.Arrays;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new Employee("Tom", 45, 80000);
        employees[1] = new Employee("Sam", 56, 75000);
        employees[2] = new Employee("Alex", 30, 120000);
        employees[3] = new Employee("Peter", 25, 60000);

        System.out.println("Before sorting: " + Arrays.toString(employees));

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Integer.valueOf(emp1.getSalary()).compareTo(Integer.valueOf(emp2.getSalary()));
            }
        });

        System.out.println("After sorting: " + Arrays.toString(employees));
    }
}

class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getSalary() {
        return this.salary;
    }

    public String toString() {
        return String.format("(%s, %d)", name, salary);
    }
}
