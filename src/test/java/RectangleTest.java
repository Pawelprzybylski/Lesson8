import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void shouldGetAreaRectangle() {
        //given
        Rectangle rectangle = new Rectangle(5, 2);
        //when
        int rectangleArea = rectangle.calculateArea();
        //then
        Assert.assertEquals(10, rectangleArea);
    }

    @Test
    public void shouldGetPerimeterRectangle() {
        //given
        Rectangle rectangle = new Rectangle(5, 2);
        //when
        int rectanglePermiter = rectangle.calculatePerimeter();
        //then
        Assert.assertEquals(14, rectanglePermiter);
    }

}
