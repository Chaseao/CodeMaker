package First_Application;

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

        for (int i = 0; i < arrayOfInputToCipher.length; i++) {
            String wordToCipher = arrayOfInputToCipher[i];
            messageToCipher
                    .enqueue(this.cipherWord(wordToCipher, arrayOfCipher));
        }

        return messageToCipher;
    }

    private int cipherWord(String wordToCipher, String[] code) {
        int cipheredWord = 0;

        for (int i = 0; i < this.alphabet.length(); i++) {
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
