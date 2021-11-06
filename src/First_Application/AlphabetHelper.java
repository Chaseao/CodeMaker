package First_Application;

import components.queue.Queue;
import components.queue.Queue2;

/**
 * @author chase
 *
 */
public final class AlphabetHelper {
    /**
     * Private constructor
     */
    private AlphabetHelper() {

    }

    /**
     * @param alphabet
     * @return the alphabet queue.
     */
    public static Queue<Character> generateAlphabet(String alphabet) {
        Queue<Character> myAlphabet = new Queue2<>();

        for (int letterIndex = 0; letterIndex < alphabet
                .length(); letterIndex++) {
            myAlphabet.enqueue(alphabet.charAt(letterIndex));
        }

        return myAlphabet;
    }
}
