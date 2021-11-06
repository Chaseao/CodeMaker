package First_Application;

import components.queue.Queue;

/**
 * @author chase
 *
 */
public interface IAlphabet {

    /**
     * This returns an alphabet dictionary.
     *
     * @return alphabet dictionary
     */
    Queue<Character> getAlphabet();

}
