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

    }

}
