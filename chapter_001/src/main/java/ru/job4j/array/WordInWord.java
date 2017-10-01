package ru.job4j.array;
/**
 * Determination that origin word contains sub word.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 04.09.2017
 */
class WordInWord {
    /**
     * Define word in word.
     *
     * @param origin is origin string
     * @param sub    is sub string
     * @return contains true if origin word contain sub word
     */
    public boolean contains(String origin, String sub) {
        boolean contains = false;
        int count = 0; // counter of characters when symbols from sub is equal origin
        char[] originChars = origin.toCharArray();
        char[] subChars = sub.toCharArray();
        for (int i = 0; i < subChars.length; i++) {
            for (int j = 0; j <= originChars.length; j++) {
                if (count == subChars.length) {
                    contains = true;
                    break;
                } else if (subChars[i] == originChars[j]) {
                    count++;
                    i++;
                } else {
                    count = 0;
                    i = 0;
                }
            }
        }
    return contains;
    }

}


