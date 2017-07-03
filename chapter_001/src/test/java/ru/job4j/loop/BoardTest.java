package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test method of chess board.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {
    /**
	* Test chess 3x3.
	*/
	@Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x%s x %<sx x%<s", line);
        assertThat(result, is(expected));
}
  /**
	* Test chess 5x5.
	*/
  @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        Board board = new Board();
        String result = board.paint(5, 4);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x x%s x x %<sx x x%<s x x %<s", line);
        assertThat(result, is(expected));
    }
}