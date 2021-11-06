package First_Application;

import components.queue.Queue;

/**
 * @author chase
 *
 */
public class MorseCodeAlphabet implements IAlphabet {

    private String title = "MorseCode";
    private String alphabet = "";

    /**
     *
     */
    @Override
    public Queue<Character> getAlphabet() {
        return AlphabetHelper.generateAlphabet(this.alphabet);
    }

    @Override
    public String getTitle() {
        return this.title;
    }

}
