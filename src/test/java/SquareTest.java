import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void shouldGetSquareArea() {
        //given
        Square square = new Square(5,5);
        //when
        double squareArea = square.getArea();
        //then
        Assert.assertEquals(25, squareArea, 0);
    }

    @Test
    public void shouldGetSquarePermiter() {
        //given
        Square square = new Square(4,4);
        //when
        double squarePerimeter = square.getPerimeter();
        //then
        Assert.assertEquals(16, squarePerimeter, 0);
    }

}
