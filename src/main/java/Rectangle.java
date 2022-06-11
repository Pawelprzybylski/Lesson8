public class Rectangle implements  GeometricFigure {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int calculatePerimeter() {
        return (2 * a) + (2 * b);
    }

    @Override
    public int calculateArea() {
        return a * b;
    }

}
