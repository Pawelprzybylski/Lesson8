import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void shouldTriangleAreaEqual8() {
        //given
        Triangle triangle = new Triangle(2, 8);
        //when
        double triangleArea = triangle.getArea();
        //then
        Assert.assertEquals(8, triangleArea, 0);
    }

    @Test
    public void shouldTrianglePermiterEqual9() {
        //given
        Triangle triangle = new Triangle(5, 2, 2);
        //when
        double trianglePerimeter = triangle.getPerimeter();
        //then
        Assert.assertEquals(9, trianglePerimeter, 0);
    }

}