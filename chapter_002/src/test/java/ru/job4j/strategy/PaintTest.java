package ru.job4j.strategy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test methods for Paint class.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    /**
     * Test drawing shape of triangle.
     */
    @Test
    public void whenShapeIsTriangleThenDrawingTriangle() {
        Shape shape = new Triangle();
        String test = "  /\\  "
                + "\n"
                + " /  \\ "
                + "\n"
                + "/    \\";
        assertThat(shape.pic(), is(test));
    }
    /**
     * Test drawing shape of square.
     */
    @Test
    public void whenShapeIsSquareThenDrawingSquare() {
        Shape shape = new Square();
        String test = "####"
                + "\n"
                + "#  #"
                + "\n"
                + "####";
        assertThat(shape.pic(), is(test));
    }
}
