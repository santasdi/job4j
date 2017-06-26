package ru.job4j.condition;
/**
 * Finding point for function.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Point {
	/**
	 * X point.
     */
	private int x;
	/**
	 * Y point.
     */
	private int y;
	/**
	 *Point.
	 *@param x is x
	 *@param y is y
     */
	public Point(int x, int y) {
	this.x = x;
	this.y = y;
	}
	/**
     * Get x.
	 * @return x
     */
	public int getX() {
	return this.x;
	}
	/**
     * Get y.
	 * @return y
     */
	public int getY() {
	return this.y;
	}
	/**
     * Belonging point for function.
	 * @param a is a
	 * @param b is b
	 * @return true is belonging poit fo function
     */
	public boolean is(int a, int b) {
	boolean flag = false;
	if (this.y == a * this.x + b) {
	flag = true;
	}
	return flag;
	}
}