package Application;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DisplayGUI {

    private JLabel titleTextField;
    private JLabel ecryptionTitleTextField;
    private JLabel ecryptionTextField;
    private JLabel decryptionTitleTextField;
    private JLabel decryptionTextField;

    private JPanel guiPanel;
    private JFrame guiWindow;

    public DisplayGUI() {
        this.initializeGUI_Window();

        this.initializeGUI_Panel();
    }

    private void initializeGUI_Panel() {
        this.guiPanel = new JPanel(new GridBagLayout());
        GridBagConstraints settings = new GridBagConstraints();
        settings.fill = GridBagConstraints.HORIZONTAL;

        this.initializeGUI_TextLabels();

        settings.gridx = 1;
        settings.gridy = 0;
        this.guiPanel.add(this.titleTextField, settings);

        settings.weightx = 0.5;
        settings.gridx = 0;
        settings.gridy = 1;
        this.guiPanel.add(this.ecryptionTitleTextField, settings);

        settings.weightx = 0;
        settings.gridx = 1;
        settings.gridy = 2;
        this.guiPanel.add(this.ecryptionTextField, settings);

        settings.weightx = 0.5;
        settings.gridx = 2;
        settings.gridy = 1;
        this.guiPanel.add(this.decryptionTitleTextField, settings);

        settings.weightx = 0;
        settings.gridx = 1;
        settings.gridy = 3;
        this.guiPanel.add(this.decryptionTextField, settings);

        this.guiWindow.add(this.guiPanel);
    }

    private void initializeGUI_TextLabels() {
        int centerAlign = SwingConstants.CENTER;

        this.titleTextField = new JLabel("Title", centerAlign);
        this.ecryptionTitleTextField = new JLabel("Language One", centerAlign);
        this.decryptionTitleTextField = new JLabel("Language Two", centerAlign);
        this.ecryptionTextField = new JLabel("Ecryption Text", centerAlign);
        this.decryptionTextField = new JLabel("Decryption Text", centerAlign);

    }

    private void initializeGUI_Window() {
        this.guiWindow = new JFrame("LangForDumb");
        this.guiWindow.pack();
        this.guiWindow.setVisible(true);
        this.guiWindow.setLocationRelativeTo(null);
        this.guiWindow.setMinimumSize(new Dimension(800, 600));
        this.guiWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void UpdateEcryptionText(String updatedText) {
        this.ecryptionTextField.setText(updatedText);
    }

    public void UpdateDecryptionText(String updatedText) {
        this.decryptionTextField.setText(updatedText);
    }

    public void UpdateTitleText(String updatedTitle) {
        this.titleTextField.setText(updatedTitle);
    }
}
