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

    /**
     * Returns English.
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public Queue<Integer> cipher(String inputToCipher) {
        Queue<Integer> cipheredMessage = new Queue2<Integer>();

        for (int i = 0; i < inputToCipher.length(); i++) {
            char currentChar = inputToCipher.toUpperCase().charAt(i);
            cipheredMessage.enqueue(this.alphabet.indexOf(currentChar));
        }
        return cipheredMessage;
    }

    @Override
    public String decipher(Queue<Integer> inputToDecipher) {
        String decipheredMessage = "";
        while (inputToDecipher.length() > 0) {
            decipheredMessage += this.alphabet
                    .charAt(inputToDecipher.dequeue());
        }
        return decipheredMessage;
    }
}
