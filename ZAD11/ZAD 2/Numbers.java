package pl.edu.pja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Numbers {

    Random random = new Random();
    private final JTextField enterNumber = new JTextField();
    private final JTextField randomNumber = new JPasswordField();
    private final JLabel resultLabel = new JLabel();

    private static final JFrame mainFrame = new JFrame();
    private static final JPanel panel = new JPanel();

    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;

    private static int SCREEN_HEIGHT;
    private static int SCREEN_WIDTH;

    {
        resolveScreenSize();
        initializePanel();
        initializeFrame();
    }

    private void initializeFrame()
    {
        mainFrame.setTitle("Numbers");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLocation(SCREEN_WIDTH/3, SCREEN_HEIGHT/3);
        mainFrame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }

    private void initializePanel()
    {
        JLabel userLabel = new JLabel();
        userLabel.setText("Enter number: ");
        panel.add(userLabel, gbc(0, 0, 1));
        enterNumber.setColumns(2);
        enterNumber.addActionListener(this::userNumber);
        panel.add(enterNumber, gbc(1, 0, 1));
        int rand = random.nextInt(49-1)+1;
        randomNumber.setText(String.valueOf(rand));
        //System.out.println("Number: " + rand);
        resultLabel.setText("Victory !");
        resultLabel.setVisible(false);
        panel.add(resultLabel, gbc(0, 2, 2));
        mainFrame.getContentPane().add(panel);
        mainFrame.setVisible(true);
    }

    private void resolveScreenSize()
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        SCREEN_HEIGHT = screenSize.height;
        SCREEN_WIDTH = screenSize.width;
    }

    private void userNumber(ActionEvent e) {
        String value = e.getActionCommand();
        try {
            int enteredNumber = Integer.parseInt(value);
            int Result = Integer.parseInt(randomNumber.getText());
            if (Result == enteredNumber) {
                resultLabel.setVisible(true);
                enterNumber.setEnabled(false);
            } else if (enteredNumber > Result) {
                JOptionPane.showMessageDialog(null, "Smaller", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Bigger", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, n.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static GridBagConstraints gbc(int x, int y, int gwidth) {
        GridBagConstraints gbcPanel = new GridBagConstraints();
        gbcPanel.fill = GridBagConstraints.BOTH;
        gbcPanel.insets = new Insets(5, 5, 5, 5);
        gbcPanel.gridx = x;
        gbcPanel.gridy = y;
        gbcPanel.gridwidth = gwidth;
        gbcPanel.gridheight = 1;
        return gbcPanel;
    }


}
