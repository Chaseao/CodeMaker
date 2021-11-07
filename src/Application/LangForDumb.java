package Application;

import EcryptionObjects.EnglishAlphabet;
import EcryptionObjects.IAlphabet;
import EcryptionObjects.MilitaryAlphabet;
import EcryptionObjects.MorseCodeAlphabet;

/**
 * @author chase
 *
 */
public final class LangForDumb {
    /**
     * @param args
     */
    public static void main(String[] args) {

        new DisplayGUI();

    }

    public static void buttonDoTranslation(DisplayGUI displayGUI) {
        IAlphabet currentAlphabet = null;
        IAlphabet translateAlphabet = null;

        String answer = displayGUI.GetEncryptionType();
        String answertranslate = displayGUI.GetDecryptionType();

        int count = 0;
        answer = answer.toLowerCase().trim();
        answertranslate = answertranslate.toLowerCase().trim();
        switch (answer) {
            case "english":
                currentAlphabet = new EnglishAlphabet();
                break;
            case "morsecode":
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

            String userinput = displayGUI.GetEncryptionText();
            String title = currentAlphabet.getTitle();
            String titletranslate = translateAlphabet.getTitle();
            components.queue.Queue<Integer> numlist = currentAlphabet
                    .cipher(userinput);
            if (numlist == null) {
                displayGUI.UpdateDecryptionText("INVALID CODE");
            } else {
                String translatelist = translateAlphabet.decipher(numlist);
                displayGUI.UpdateDecryptionText(translatelist);
            }

        } else {
            displayGUI.UpdateDecryptionText("INVALID CODE");
        }

    }

}
