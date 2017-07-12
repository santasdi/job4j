package ru.job4j.loop;
/**
 * Paint piramid.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
	/**
	* Painting piramid.
	* @param h is height of piramid
	* @return imagine of piramid by stringbuilder
	*/
public String piramid(int h) {
StringBuilder piramid = new StringBuilder();
	for (int i = 1; i <= h; i++) {
		for (int j = 1; j <= h + (h - 1); j++) {
	    if (j > h - i && j < h + i) {
	    piramid.append("^");
           } else {
           piramid.append(" ");
	   }
   }
	piramid.append(System.getProperty("line.separator"));
}
return piramid.toString();
}
}