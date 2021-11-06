package First_Application;

import components.queue.Queue;

/**
 * @author chase
 *
 */
public class MilitaryAlphabet implements IAlphabet {

    private Queue<Character> myAlphabet;
    private String title = "Military";
    private String alphabet = "Alpha Bravo Charlie Delta Echo Foxtrot Golf "
            + "Hotel India Juliet Kilo Lima Mike Novemeber Oscar Papa Quebec "
            + "Romeo Sierra Tango Uniform Victor Whiskey X-ray Yankee Zulu";

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public Queue<Integer> cipher(String inputToCipher) {

        return null;
    }

    @Override
    public String decipher(Queue<Integer> inputToDecipher) {
        // TODO Auto-generated method stub
        return null;
    }
}
