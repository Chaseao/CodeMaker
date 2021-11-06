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

        out.println("What Language do you wish to learn?: ");
        String answer = in.nextLine();

        while (!answer.equals("")) {
            switch (answer) {
                case "English":
                    currentAlphabet = new EnglishAlphabet();
                    break;
                case "French":
                    currentAlphabet = new FrenchAlphabet();
                    break;
                case "Spanish":
                    currentAlphabet = new SpanishAlphabet();
                    break;
                default:
                    out.println("Good Bye!");
                    break;

            }
            String title = currentAlphabet.getTitle();
            components.queue.Queue<Character> list = currentAlphabet
                    .getAlphabet();
            components.queue.Queue<Character> soundlist = currentAlphabet
                    .getSoundAlphabet();
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
