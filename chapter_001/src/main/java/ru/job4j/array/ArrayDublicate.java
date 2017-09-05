package ru.job4j.array;
import java.util.Arrays;
/**
 * Remove dublicate in array.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 17.07.2017
 */
public class ArrayDublicate {
  /**
	* Remove dublicates indexes in array.
	* @param array is pull of strings
	* @return array without dublicates indexes
	*/
    public String[] remove(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String temp = array[i];
			for (int j = i; j < array.length - 1; j++) {
                if (array[i].equals(array[j + 1])) {
				for (int k = i; k < array.length - 1; k++) {
				array[k] = array[k + 1];
				}
				count++;
				}
		    }
            array[array.length - 1] = temp;
			break;
		}
		return Arrays.copyOf(array, array.length - count);
	}
}