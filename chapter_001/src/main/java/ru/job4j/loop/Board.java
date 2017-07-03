package ru.job4j.loop;
/**
 * Pseudographic.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Board {
   /**
	* Factorial from 1 to 5.
	* @param width is width of chess area
	* @param height is height of chess area
	* @return chessline is string of characters
	*/
	public String paint(int width, int height) {
	StringBuilder chessline = new StringBuilder();
	for (int i = 1; i <= height; i++) {
	for (int j = 1; j <= width; j++) {
	if ((i + j) % 2 == 0) {
	chessline.append("x");
	} else {
	chessline.append(" ");
}
}
	chessline.append(System.getProperty("line.separator"));
}
	return chessline.toString();
}

}
