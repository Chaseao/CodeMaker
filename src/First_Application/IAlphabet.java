package First_Application;

import components.queue.Queue;

/**
 * @author chase
 *
 */
public interface IAlphabet {

    /**
     * @param inputToCipher
     * @return the coded input
     */
    Queue<Integer> cipher(String inputToCipher);

    /**
     * @param inputToDecipher
     * @return the deciphered output
     */
    String decipher(Queue<Integer> inputToDecipher);

    /**
     * @return the sound alphabet of a language
     */

    /**
     * @return the title of the alphabet
     */
    String getTitle();

}
