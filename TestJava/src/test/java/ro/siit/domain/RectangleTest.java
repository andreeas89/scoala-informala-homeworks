package ro.siit.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void perimeterTest() {
        Rectangle rectangle = new Rectangle(2, 4);
        double value = rectangle.perimeter();

        Assert.assertEquals(12, value, 0);

    }
    @Test
    public void surfaceTest(){
        Rectangle rectangle = new Rectangle(2, 4);
        double value = rectangle.surface();

        Assert.assertEquals(8, value, 0);
    }

}