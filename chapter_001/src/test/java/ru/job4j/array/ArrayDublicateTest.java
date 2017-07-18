package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test remove dublicates in array.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 17.07.2017
 */
public class ArrayDublicateTest {
   /**
	* Test method remove dublicates in array.
	*/
	@Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
       ArrayDublicate dublicate = new ArrayDublicate();
	   String[] testArray = {"John", "Alex", "John", "Lissa", "Alex", "Carl"};
	   String[] resultArray = dublicate.remove(testArray);
	   String[] expectedArray = {"John", "Lissa", "Alex", "Carl"};
	   assertThat(resultArray, is(expectedArray));
	}
}