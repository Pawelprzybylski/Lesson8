import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void shouldAreaRectangleEqual10() {
        //given
        Rectangle rectangle = new Rectangle(5, 2);
        //when
        int rectangleArea = rectangle.calculateArea();
        //then
        Assert.assertEquals(10, rectangleArea);
    }

    public void shouldPerimeterRectangleEqual14() {
        //given
        Rectangle rectangle = new Rectangle(5, 2);
        //when
        int rectanglePermiter = rectangle.calculatePerimeter();
        //then
        Assert.assertEquals(14, rectanglePermiter);
    }

}
