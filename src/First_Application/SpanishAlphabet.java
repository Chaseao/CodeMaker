package First_Application;

import components.queue.Queue;

/**
 * @author chase
 *
 */
public class SpanishAlphabet implements IAlphabet {

    private Queue<Character> myAlphabet;
    private String title = "English";
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     *
     */
    @Override
    public Queue<Character> getAlphabet() {
        // TODO Auto-generated method stub;
        return AlphabetHelper.generateAlphabet(this.alphabet);
    }

    /**
     * Returns English
     */
    @Override
    public String getTitle() {
        return this.title;
    }
}
