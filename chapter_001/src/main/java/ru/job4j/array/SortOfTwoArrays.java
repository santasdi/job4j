package ru.job4j.array;

/**
 *Sort two arrays to third.
 *@author Artem Bartenev (bartenev92@gmail.com)
 *@version $Id$
 * @since 0.1
 */
public class SortOfTwoArrays {
    /*
     *Sorting two arrays
     * @param first is first array
     * @param second is second array
     * @return result arrays after sorting
     */
    public int[] arraySort(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            result[i] = first[i];}
        for (int k = 0; k < second.length; k++) {
            result[first.length + k] = second[k];
        }
        for (int j = 0; j < result.length; j++) {
            for (int m = 0; m < result.length - 1; m++) {
                if (result[m] > result[m + 1]) {
                    int temp = result[m];
                    result[m] = result[m + 1];
                    result[m + 1] = temp;
                }

            }
        }
        return result;
    }
}
