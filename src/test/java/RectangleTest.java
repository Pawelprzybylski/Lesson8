import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void shouldRectangleAreaEqual20() {
        //given
        Rectangle rectangle = new Rectangle(5, 10);
        //when
        double rectangleArea = rectangle.getArea();
        //then
        Assert.assertEquals(50, rectangleArea, 0);
    }

    @Test
    public void shouldRectanglePermiterEqual128() {
        //given
        Rectangle rectangle = new Rectangle(4, 8);
        //when
        double rectanglePerimeter = rectangle.getPerimeter();
        //then
        Assert.assertEquals(128, rectanglePerimeter, 0);
    }

}
