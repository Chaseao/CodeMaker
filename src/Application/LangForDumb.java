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

        final DisplayGUI2 display = new DisplayGUI2();

    }

    public static void buttonDoTranslation(DisplayGUI2 display) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        IAlphabet currentAlphabet = null;
        IAlphabet translateAlphabet = null;

        out.print("Please input encoding language: ");
        String answer = in.nextLine();
        out.print("Please input decoding language: ");
        String answertranslate = in.nextLine();

        int count = 0;
        answer = answer.toLowerCase().trim();
        answertranslate = answertranslate.toLowerCase().trim();
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

            String userinput = display.GetEncryptionText();
            String title = currentAlphabet.getTitle();
            String titletranslate = translateAlphabet.getTitle();
            components.queue.Queue<Integer> numlist = currentAlphabet
                    .cipher(userinput);
            if (numlist == null) {
                display.UpdateDecryptionText("");
            } else {
                String translatelist = translateAlphabet.decipher(numlist);
                display.UpdateTitleText(
                        "Translating from " + title + " to " + titletranslate);
                out.println("");
                display.UpdateDecryptionText(
                        userinput + " translates to " + translatelist);
                out.println("");
            }

        } else {
            out.println("Good Bye!");
        }

    }

}
