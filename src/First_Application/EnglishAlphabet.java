package First_Application;

import components.queue.Queue;

/**
 * @author chase
 *
 */
public class EnglishAlphabet implements IAlphabet {

    /**
     *
     */
    private Queue<Character> myAlphabet;

    /**
     * Generates a new queue.
     */
    private void generateAlphabet() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        this.myAlphabet.clear();

        for (int letterIndex = 0; letterIndex < alphabet
                .length(); letterIndex++) {
            this.myAlphabet.enqueue(alphabet.charAt(letterIndex));
        }
    }

    /**
     *
     */
    @Override
    public Queue<Character> getAlphabet() {
        // TODO Auto-generated method stub
        this.generateAlphabet();
        return this.myAlphabet;
    }
}
