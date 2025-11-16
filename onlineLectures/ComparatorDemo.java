import java.util.*;

class Employee {
    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return name + " " + empId;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("akash", 2475073);
        Employee e2 = new Employee("ruchi", 2523104);
        Employee e3 = new Employee("ramesh", 231254);
        Employee e4 = new Employee("radha", 341245);

        List<Employee> ds = Arrays.asList(e1, e2, e3, e4);

//        Comparator<Employee> x = (a, b) -> Integer.compare(a.empId, b.empId);
//        Collections.sort(ds, x);

        // BEST WAY and SHORTEST WAY
//        Collections.sort(ds, (a, b) -> Integer.compare(a.empId, b.empId));

        Collections.sort(ds, (a, b) -> a.name.compareTo(b.name));

        System.out.println(ds);
    }
}


// TRADITIONAL WAY OF SORTING

//import java.util.*;
//
//class Employee {
//    String name;
//    int empId;
//
//    Employee(String name, int empId) {
//        this.name = name;
//        this.empId = empId;
//    }
//
//    @Override
//    public String toString() {
//        return name + " " + empId;
//    }
//}
//
//class MyRuleOfSorting implements Comparator<Employee> {
//    @Override
//    public int compare(Employee a, Employee b) {
//        return Integer.compare(a.empId, b.empId);
//    }
//}
//
//public class ComparatorDemo {
//    public static void main(String[] args) {
//        Employee e1 = new Employee("akash", 2475073);
//        Employee e2 = new Employee("ruchi", 2523104);
//        Employee e3 = new Employee("ramesh", 231254);
//        Employee e4 = new Employee("radha", 341245);
//
//        List<Employee> ds = Arrays.asList(e1, e2, e3, e4);
//
//        MyRuleOfSorting obj = new MyRuleOfSorting();
//
//        Collections.sort(ds, obj);
//
//        System.out.println(ds);
//    }
//}
