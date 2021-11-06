package First_Application;

import components.queue.Queue;

/**
 * @author chase
 *
 */
public class JapaneseAlphabet implements IAlphabet {

    private String title = "Japanese";
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
