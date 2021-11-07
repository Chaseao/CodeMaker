package Application;

import EcryptionObjects.EnglishAlphabet;
import EcryptionObjects.IAlphabet;
import EcryptionObjects.MilitaryAlphabet;
import EcryptionObjects.MorseCodeAlphabet;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * @author chase
 *
 */
public final class LangForDumb {
    /**
     * @param args
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        final DisplayGUI display = new DisplayGUI();

        IAlphabet currentAlphabet = null;
        IAlphabet translateAlphabet = null;

        out.println("What Language do you wish to translate from?: ");
        String answer = in.nextLine();
        out.println("What Language do you wish to translate to?: ");
        String answertranslate = in.nextLine();
        int count = 0;

        while ((!answer.equals("")) && !answertranslate.equals("")) {
            answer = answer.toLowerCase();
            answertranslate = answertranslate.toLowerCase();
            switch (answer) {
                case "english":
                    currentAlphabet = new EnglishAlphabet();
                    break;
                case "morseCode":
                    currentAlphabet = new MorseCodeAlphabet();
                    break;
                case "military":
                    currentAlphabet = new MilitaryAlphabet();
                    break;
                default:
                    count = 1;
                    break;

            }
            switch (answertranslate) {
                case "english":
                    translateAlphabet = new EnglishAlphabet();
                    break;
                case "morsecode":
                    translateAlphabet = new MorseCodeAlphabet();
                    break;
                case "military":
                    translateAlphabet = new MilitaryAlphabet();
                    break;
                default:
                    count = 1;
                    break;

            }
            if (count == 0) {

                out.println("Please enter in a String: ");
                String userinput = in.nextLine();
                String title = currentAlphabet.getTitle();
                String titletranslate = translateAlphabet.getTitle();
                components.queue.Queue<Integer> numlist = currentAlphabet
                        .cipher(userinput);
                if (numlist == null) {
                    out.println("Not a valid String");
                }
                String translatelist = translateAlphabet.decipher(numlist);
                display.UpdateTitleText(
                        "Translating from " + title + " to " + titletranslate);
                out.println("");
                display.UpdateDecryptionText(
                        userinput + " translates to " + translatelist);
                out.println("");
                out.println("What Language do you wish to translate?: ");
                answer = in.nextLine();
                out.println("What Language do you wish to translate to?: ");
                answertranslate = in.nextLine();
            } else {
                out.println("Good Bye!");
                break;
            }

        }

    }

}
