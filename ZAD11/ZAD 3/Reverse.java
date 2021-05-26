package pl.edu.pja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Reverse {

    private static final JFrame mainFrame = new JFrame();
    private static final JPanel panel = new JPanel();
    private final JLabel output = new JLabel();
    private final JTextField userEnter = new JTextField();

    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;

    private static int SCREEN_HEIGHT;
    private static int SCREEN_WIDTH;

    {
        resolveScreenSize();
        initializePanel();
        initializeFrame();
    }

    private void initializePanel()
    {
        userEnter.setColumns(20);
        userEnter.addActionListener(this::userEnter);
        panel.add(userEnter, gbc(0,0, 1));
        panel.add(output, gbc(0, 1, 1));
    }

    private void resolveScreenSize()
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        SCREEN_HEIGHT = screenSize.height;
        SCREEN_WIDTH = screenSize.width;
    }

    private void initializeFrame()
    {
        mainFrame.setTitle("Reverse");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLocation(SCREEN_WIDTH/3, SCREEN_HEIGHT/3);
        mainFrame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }

    private void userEnter(ActionEvent e) {
        String value = e.getActionCommand();
        output.setText(new StringBuffer(value).reverse().toString());
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
