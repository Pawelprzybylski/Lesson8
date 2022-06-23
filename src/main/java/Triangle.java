public class Triangle implements GeometricFigure {
    private int a;
    private int h;
    private int b;
    private int c;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b=b;
        this.c=c;
        this.h = h;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getA() {
        return a;
    }

    public int getH() {
        return h;
    }

    @Override
    public int calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public int calculateArea() {
        return ((a * h) / 2);
    }
}
