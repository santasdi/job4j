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
	 * Method for calculating distance between points.
	 * @param first is coordinates of first point
	 * @param second is coordinates of second point
	 * @return value of distance
     */
	public double distance(Point first, Point second) {
	return Math.sqrt((first.getX() - second.getX()) * (first.getX() - second.getX()) + (first.getY() - second.getY()) * (first.getY() - second.getY()));
	}
	/**
	 * Method for area calculation.
	 * @return area is square of triangle
     */
	public double area() {
	double p = (distance(this.a, this.b) + distance(this.a, this.c) + distance(this.b, this.c)) / 2.0;
	double area = Math.sqrt(p * (p - distance(this.a, this.b)) * (p - distance(this.a, this.c)) * (p - distance(this.b, this.c)));
	if (distance(this.a, this.b) + distance(this.a, this.c) > distance(this.b, this.c)) {
	return area;
	} else {
	return -1.0;
	}
}
}