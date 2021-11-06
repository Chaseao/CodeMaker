package First_Application;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
        JFrame frame = new JFrame("Hello World APP");

        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);
        //frame.getContentPane().add(lblText);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        IAlphabet currentAlphabet = null;
        IAlphabet translateAlphabet = null;

        out.println("What Language do you wish to translate from?: ");
        String answer = in.nextLine();
        out.println("What Language do you wish to translate to?: ");
        String answertranslate = in.nextLine();
        int count = 0;
        answer.toLowerCase();
        answertranslate.toLowerCase();

        while ((!answer.equals("")) && !answertranslate.equals("")) {
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
                    out.println("Good Bye!");
                    count = 1;
                    break;

            }
            switch (answertranslate) {
                case "english":
                    translateAlphabet = new EnglishAlphabet();
                    break;
                case "morseCode":
                    translateAlphabet = new MorseCodeAlphabet();
                    break;
                case "military":
                    translateAlphabet = new MilitaryAlphabet();
                    break;
                default:
                    out.println("Good Bye!");
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
                JLabel lblText = new JLabel();
                lblText.add("Translating from " + userinput + " to "
                        + titletranslate, lblText);
                frame.getContentPane().add(lblText);
                out.println("");
                out.println(userinput + " translates to " + translatelist);
                out.println("");
                out.println("What Language do you wish to translate?: ");
                answer = in.nextLine();
                out.println("What Language do you wish to translate to?: ");
                answertranslate = in.nextLine();
            }

        }

    }

}
