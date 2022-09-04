import java.lang.Math;

interface Polygon {

    void getArea();

    default void calculatePerimeter(int... sides) {
        int perimeter = 0;
        for (int i : sides) {
            perimeter += i;
        }
        System.out.println("Perimeter is " + perimeter);
    }

}

class Triangle implements Polygon {

    private int a, b, c;
    private double s, area;

    Triangle(int p, int q, int r) {
        this.a = p;
        this.b = q;
        this.c = r;
        s = 0;
    }

    public void getArea() {
        s = (double) (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle is " + area);
    }

}

public class Interface {
    public static void main(String[] args) {
        Triangle object1 = new Triangle(2, 3, 4);
        object1.getArea();
        object1.calculatePerimeter(2, 3, 4);
    }
}
