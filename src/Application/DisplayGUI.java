package Application;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class DisplayGUI {

    private JLabel titleTextField;
    private JComboBox<String> ecryptionTitleTextField;
    private JTextArea encryptionTextField;
    private JComboBox<String> decryptionTitleTextField;
    private JTextArea decryptionTextField;
    private JButton translateButton;

    private JPanel guiPanel;
    private JFrame guiWindow;

    public DisplayGUI() {
        this.initializeGUI_Window();
        this.initializeGUI_Panel();

        this.guiWindow.pack();
        this.guiWindow.setVisible(true);
    }

    private void initializeGUI_Panel() {
        this.guiPanel = new JPanel(new GridBagLayout());
        GridBagConstraints settings = new GridBagConstraints();
        settings.fill = GridBagConstraints.HORIZONTAL;

        this.initializeGUI_TextLabels();

        settings.weightx = 1;
        settings.gridx = 0;
        settings.gridy = 0;
        settings.gridwidth = 3;
        settings.insets = new Insets(-30, 0, 0, 0);
        this.guiPanel.add(this.titleTextField, settings);

        settings.weightx = 1;
        settings.gridx = 0;
        settings.gridy = 1;
        settings.gridwidth = 1;
        settings.insets = new Insets(10, 0, 0, 0);
        this.guiPanel.add(this.ecryptionTitleTextField, settings);

        settings.weightx = 0;
        settings.gridx = 1;
        settings.gridy = 1;
        settings.gridheight = 2;
        this.guiPanel.add(this.translateButton, settings);

        settings.weightx = 1;
        settings.gridx = 2;
        settings.gridy = 1;
        settings.gridheight = 1;
        this.guiPanel.add(this.decryptionTitleTextField, settings);

        JScrollPane scrollEncryption = new JScrollPane(
                this.encryptionTextField);
        scrollEncryption.setVerticalScrollBarPolicy(
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        settings.weightx = 0;
        settings.gridx = 0;
        settings.gridy = 2;
        settings.insets = new Insets(0, 0, 0, 0);
        this.guiPanel.add(scrollEncryption, settings);

        JScrollPane scrollDecryption = new JScrollPane(
                this.decryptionTextField);
        scrollDecryption.setVerticalScrollBarPolicy(
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        settings.weightx = 0.5;
        settings.gridx = 2;
        settings.gridy = 2;
        this.guiPanel.add(scrollDecryption, settings);

        this.guiWindow.add(this.guiPanel);
    }

    private void initializeGUI_TextLabels() {
        int centerAlign = SwingConstants.CENTER;
        String[] lang = { "English", "MorseCode", "Military" };

        this.titleTextField = new JLabel("Secret Messages", centerAlign);
        this.titleTextField.setFont(new Font("Serif", Font.BOLD, 24));

        this.ecryptionTitleTextField = new JComboBox<String>(lang);

        this.decryptionTitleTextField = new JComboBox<String>(lang);

        this.encryptionTextField = new JTextArea(4, 1);
        this.encryptionTextField.setLineWrap(true);

        this.decryptionTextField = new JTextArea(4, 1);
        this.decryptionTextField.setLineWrap(true);
        this.decryptionTextField.setEditable(false);

        this.instantiateButton();

    }

    private void initializeGUI_Window() {
        this.guiWindow = new JFrame("LangForDumb");
        this.guiWindow.setPreferredSize(new Dimension(800, 200));
        this.guiWindow.setResizable(false);
        this.guiWindow.setLocationRelativeTo(null);
        this.guiWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void instantiateButton() {
        this.translateButton = new JButton("Code Message");

        this.translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LangForDumb.buttonDoTranslation(DisplayGUI.this);
            }
        });
    }

    public String GetEncryptionType() {
        return (String) this.ecryptionTitleTextField.getSelectedItem();
    }

    public String GetDecryptionType() {
        return (String) this.decryptionTitleTextField.getSelectedItem();
    }

    public String GetEncryptionText() {
        return this.encryptionTextField.getText();
    }

    public void UpdateEncryptionText(String updatedText) {
        this.encryptionTextField.setText(updatedText);
    }

    public void UpdateDecryptionText(String updatedText) {
        this.decryptionTextField.setText(updatedText);
    }

    public void UpdateTitleText(String updatedTitle) {
        this.titleTextField.setText(updatedTitle);
    }

}
