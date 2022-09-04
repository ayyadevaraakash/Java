class Perimeter {
    private int p = 0;

    void calculate(int a, int b) {
        p = a + b;
        System.out.println("Perimeter is " + p);
    }

    void calculate(int a, int b, int c) {
        p = a + b + c;
        System.out.println("Perimeter is " + p);
    }

}

class MethodOverloading {
    public static void main(String[] args) {
        Perimeter p1 = new Perimeter();
        p1.calculate(5, 4);
        p1.calculate(7, 4, 1);
    }
}
