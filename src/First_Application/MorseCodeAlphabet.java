package First_Application;

import components.queue.Queue;

/**
 * @author chase
 *
 */
public class MorseCodeAlphabet implements IAlphabet {

    private String title = "MorseCode";
    private String alphabet = "";

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
