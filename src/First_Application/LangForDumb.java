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

        JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);
        frame.getContentPane().add(lblText);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        IAlphabet currentAlphabet = null;
        IAlphabet translateAlbhabet = null;

        out.println("What Language do you wish to translate from?: ");
        String answer = in.nextLine();
        out.println("What Language do you wish to translate to?: ");
        String answer1 = in.nextLine();

        while (!answer.equals("")) {
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
            switch (answer1) {
                case "English":
                    translateAlbhabet = new EnglishAlphabet();
                    break;
                case "MorseCode":
                    translateAlbhabet = new MorseCodeAlphabet();
                    break;
                case "Military":
                    translateAlbhabet = new MilitaryAlphabet();
                    break;
                default:
                    out.println("Good Bye!");
                    break;

            }

            String title = currentAlphabet.getTitle();
            String titletranslate = translateAlbhabet.getTitle();
            components.queue.Queue<Character> list = currentAlphabet
                    .translate();
            components.queue.Queue<Character> soundlist = translateAlbhabet
                    .translate();
            out.println("title = " + title);
            out.println(list);
            out.println(soundlist);
            out.println("");
            for (int i = 0; i < list.length(); i++) {
                out.print(list.dequeue());
                out.print(" , ");
            }
            for (int i = 0; i < soundlist.length(); i++) {
                out.print(soundlist.dequeue());
                out.print(" , ");
            }
            out.println("");
            out.println("What Language do you wish to learn?: ");
            answer = in.nextLine();

        }

    }

}
