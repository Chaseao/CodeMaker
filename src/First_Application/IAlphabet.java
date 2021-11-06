package First_Application;

import java.util.Dictionary;

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
    Queue<Dictionary<String, String>> getAlphabet();

}
