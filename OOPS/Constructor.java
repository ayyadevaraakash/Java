class Greeting {
    Greeting() {
        System.out.println("Welcome User");
    }
}

class Triangle extends Greeting {

    private int base, height;
    private double area = 0;

    Triangle(int b, int h) {
        super();
        this.base = b;
        this.height = h;
    }

    void calculateArea() {
        area = (double) (0.5 * base * height);
        System.out.println("Area of the Triangle is " + area);
    }
}

class Constructor {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(4, 5);
        t1.calculateArea();
    }
}
