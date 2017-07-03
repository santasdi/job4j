package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test method for piramid.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
   /**
	* Test painting  piramid 2x3.
	*/
	@Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
		 String line = System.getProperty("line.separator");
        String expected = String.format(" ^ %s^^^%s", line, line);
        assertThat(result, is(expected));
    }
   /**
	* Test painting  piramid 3x5.
	*/
    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
       Paint paint = new Paint();
	   String result = paint.piramid(3);
	   String line = System.getProperty("line.separator");
	   String expected = String.format("  ^  %s ^^^ %s^^^^^%s", line, line, line);
	   assertThat(result, is(expected));
    }
}