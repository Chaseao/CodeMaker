package First_Application;

import components.queue.Queue;

/**
 * @author chase
 *
 */
public class EnglishAlphabet implements IAlphabet {

    private String title = "English";
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * Returns English
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public Queue<Integer> cipher(String inputToCipher) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String decipher(Queue<Integer> inputToDecipher) {
        // TODO Auto-generated method stub
        return null;
    }
}
