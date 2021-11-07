package EcryptionObjects;

import components.queue.Queue;
import components.queue.Queue2;

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
        Queue<Integer> messageToCipher = new Queue2<Integer>();
        String[] arrayOfInputToCipher = inputToCipher.toUpperCase().split(" ");
        String[] arrayOfCipher = this.alphabet.toUpperCase().split(" ");
        boolean invalidOutput = false;

        for (int i = 0; i < arrayOfInputToCipher.length
                && !invalidOutput; i++) {
            String wordToCipher = arrayOfInputToCipher[i];
            int cipheredWord = this.cipherWord(wordToCipher, arrayOfCipher);

            if (cipheredWord != -1) {
                messageToCipher.enqueue(cipheredWord);
            } else {
                invalidOutput = true;
                messageToCipher = null;
            }
        }

        return messageToCipher;
    }

    private int cipherWord(String wordToCipher, String[] code) {
        int cipheredWord = -1;

        for (int i = 0; i < code.length; i++) {
            if (wordToCipher.equals(code[i])) {
                cipheredWord = i;
            }
        }

        return cipheredWord;
    }

    @Override
    public String decipher(Queue<Integer> inputToDecipher) {
        String decipheredWord = "";
        String[] arrayOfCipher = this.alphabet.toUpperCase().split(" ");

        while (inputToDecipher.length() > 0) {
            decipheredWord += arrayOfCipher[inputToDecipher.dequeue()] + " ";
        }

        return decipheredWord;
    }
}
