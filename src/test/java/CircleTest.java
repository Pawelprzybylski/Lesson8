import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    public void shouldCircleAreaEquals7() {
        //given 1.493
        Circle circle = new Circle();
        circle.setRadius(1.493);
        //when
        double circleArea = circle.getArea();
        //then
        Assert.assertEquals(7, circleArea, 0.01);
    }

    @Test
    public void shouldCircleePermiterEquals8() {
        //given
        Circle circle = new Circle();
        circle.setRadius(1.272);
        //when
        double circlePerimeter = circle.getPerimeter();
        //then
        Assert.assertEquals(4, circlePerimeter, 0.01);
    }

}