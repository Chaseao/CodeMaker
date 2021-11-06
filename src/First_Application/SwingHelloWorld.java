package First_Application;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * @author chase
 *
 */
public final class SwingHelloWorld {
    /**
     * @param args
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello World APP");

        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);

        frame.getContentPane().add(lblText);

        frame.pack();
        frame.setVisible(true);

    }

}
