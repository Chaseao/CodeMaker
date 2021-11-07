package EcryptionObjects;

import components.queue.Queue;
import components.queue.Queue2;

/**
 * @author chase
 *
 */
public class MorseCodeAlphabet implements IAlphabet {

    private String title = "MorseCode";
    private String alphabet = "";
    private String[] morse = { "*-", "-***", "-*-*", "-**", "*", "**-*", "--*",
            "****", "**", "*---", "-*-", "*-**", "--", "-*", "---", "*--*",
            "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--",
            "--**", "/" };

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public Queue<Integer> cipher(String inputToCipher) {
        Queue<Integer> MorseCordeCipher = new Queue2<Integer>();

        String[] codesplit = inputToCipher.split(" ");
        for (int i = 0; i < codesplit.length; i++) {
            for (int j = 0; j < this.morse.length; j++) {
                if (codesplit[i].equals(this.morse[j])) {
                    MorseCordeCipher.enqueue(j);
                }
            }

        }
        System.out.println(codesplit.length);

        if (codesplit.length != MorseCordeCipher.length()) {
            MorseCordeCipher = null;
        }
        return MorseCordeCipher;
    }

    @Override
    public String decipher(Queue<Integer> inputToDecipher) {
        String answer = "";
        int length = inputToDecipher.length();
        for (int k = 0; k < length; k++) {
            int num = inputToDecipher.dequeue();
            answer += this.morse[num] + " ";
        }
        return answer;
    }

}
