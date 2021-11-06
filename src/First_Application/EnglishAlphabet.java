package First_Application;

import components.queue.Queue;
import components.queue.Queue2;

/**
 * @author chase
 *
 */
public class EnglishAlphabet implements IAlphabet {

    private String title = "English";
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    public Queue<String> getSoundAlphabet() {
        Queue<String> soundAlphabet = new Queue2<>();

        return soundAlphabet;
    }

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
