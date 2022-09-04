// Multiple Inheritance is not supported by Java. So, we will implement it using interfaces
interface Quadrilateral {
    default void message() {
        System.out.println("I'm a quadrilateral");
    }
}

interface Parallelogram {
    default void printMessage() {
        System.out.println("It's a parallelogram");
    }
}

class Rhombus implements Quadrilateral, Parallelogram {
    public void myMethod() {
        System.out.println("I'm a rhombus");
    }
}

class MultipleInheritance {
    public static void main(String[] args) {
        Rhombus r1 = new Rhombus();
        r1.message();
        r1.printMessage();
        r1.myMethod();
    }
}
