package EcryptionObjects;

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
        boolean invalidOutput = false;

        for (int i = 0; i < inputToCipher.length() && !invalidOutput; i++) {
            char currentChar = inputToCipher.toUpperCase().charAt(i);
            int encodedWord = this.alphabet.indexOf(currentChar);
            if (encodedWord != -1) {
                cipheredMessage.enqueue(encodedWord);
            } else {
                invalidOutput = true;
                cipheredMessage = null;
            }
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
