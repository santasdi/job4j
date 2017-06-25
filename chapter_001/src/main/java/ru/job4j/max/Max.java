package ru.job4j.max;
/**
 * Finfing max number.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
 public class Max {
	/**
	* finding max number.
	*@param first is first number
	*@param second is second number
	*@return max between first and second
	*/
	public int max(int first, int second) {
	int maxi = (first > second) ? first : second;
	return maxi;
	}
}