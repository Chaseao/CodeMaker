package First_Application;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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

        while ((!answer.equals("")) && !answertranslate.equals("")) {
            switch (answer) {
                case "English":
                    currentAlphabet = new EnglishAlphabet();
                    break;
                case "MorseCode":
                    currentAlphabet = new MorseCodeAlphabet();
                    break;
                case "Military":
                    currentAlphabet = new MilitaryAlphabet();
                    break;
                default:
                    out.println("Good Bye!");
                    break;

            }
            switch (answertranslate) {
                case "English":
                    translateAlphabet = new EnglishAlphabet();
                    break;
                case "MorseCode":
                    translateAlphabet = new MorseCodeAlphabet();
                    break;
                case "Military":
                    translateAlphabet = new MilitaryAlphabet();
                    break;
                default:
                    out.println("Good Bye!");
                    break;

            }
            out.println("Please enter in a String: ");
            String userinput = in.nextLine();

            String title = currentAlphabet.getTitle();
            String titletranslate = translateAlphabet.getTitle();
            components.queue.Queue<Integer> list = currentAlphabet
                    .cipher(userinput);
            out.println(list);
            String translatelist = translateAlphabet.decipher(list);
            JLabel lblText = new JLabel(
                    "Translating from " + title + " to " + titletranslate,
                    SwingConstants.CENTER);
            frame.getContentPane().add(lblText);
            out.println("");
            out.println(userinput + " translates to " + translatelist);
            out.println("");
            out.println("What Language do you wish to learn?: ");
            answer = in.nextLine();
            out.println("What Language do you wish to translate to?: ");
            answertranslate = in.nextLine();

        }

    }

}
