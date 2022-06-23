import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void shouldGetAreaTriangleEqual() {
        //given
        Triangle triangle = new Triangle(5, 3,3,4);
        //when
        int triangleArea = triangle.calculateArea();
        //then
        Assert.assertEquals(10, triangleArea);
    }
    @Test
    public void shouldGetPerimeterTriangle() {
        //given
        Triangle triangle = new Triangle(5, 2, 7);
        //when
        int triangleePermiter = triangle.calculatePerimeter();
        //then
        Assert.assertEquals(14, triangleePermiter);
    }

}
