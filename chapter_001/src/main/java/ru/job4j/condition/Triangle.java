package ru.job4j.condition;
/**
 * Calculate area.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Triangle {
	/**
	 * a point.
     */
	private Point a;
	/**
	 * b point.
     */
	private Point b;
	/**
	 * c point.
     */
	private Point c;
	/**
	 *Triange constructor.
	 *@param a is a point
	 *@param b is b point
	 *@param c is c point
     */
	public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
}
	/**
	 * Method for area calculation.
	 * @return area is square of triangle
     */
	public double area() {
	double sideA = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
	double sideB = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));
	double sideC = Math.sqrt((b.getX() - c.getX()) * (b.getX() - c.getX()) + (b.getY() - c.getY()) * (b.getY() - c.getY()));
	double p = (sideA + sideB + sideC) / 2.0;
	double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	if (sideA + sideB > sideC) {
	return area;
	} else {
	return -1.0;
	}
}
}