public class Triangle implements GeometricFigure {
    private int a;
    private int h;
    private int b;
    private int c;

    public Triangle(int a, int h) {
        this.a = a;
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

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
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
