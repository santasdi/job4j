package ru.job4j.calculator;
/**
 * Simple Calculator.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
	/**
     * Methods for calculating.
	 * @param result is result
     */
	private double result;
	/**
	 * Method Summary.
	 * @param first is first
	 * @param second is second
	 */
   	public void add(double first, double second) {
		this.result = first + second;
	}
	/**
	 * Method Substract.
	 * @param first is first
	 * @param second is second
	 */
	public void substract(double first, double second) {
		this.result = first - second;
	}
	/**
	 * Method Multiplication.
	 * @param first is first
	 * @param second is second
	 */
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	/**
	 * Method Division.
	 * @param first is first
	 * @param second is second
	 */
	public void divison(double first, double second) {
		this.result = first / second;
	}
	/**
	 * Method getresult.
	 * @return result
	 */
	public double getResult() {
		return this.result;
	}
}