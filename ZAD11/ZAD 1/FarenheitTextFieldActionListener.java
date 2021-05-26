package pl.edu.pja;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FarenheitTextFieldActionListener implements ActionListener {

    private  final Mediator mediator;

    public FarenheitTextFieldActionListener(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String value = e.getActionCommand();
        try {
            double f = Double.parseDouble(value);
            double result = new CalculateService().convertFtoC(f);
            mediator.setC(result);
        } catch (NumberFormatException numberFormatException)
        {
            JOptionPane.showMessageDialog(null, numberFormatException.getMessage(), "INVALID F VALUE", JOptionPane.ERROR_MESSAGE);
        }
    }
}
