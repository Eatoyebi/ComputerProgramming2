import javax.swing.*;
import java.awt.*;

class TemperatureConverter {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Units Converter");

        JLabel celsiusLabel = new JLabel("Celsius: ");
        JLabel fahrenheitLabel = new JLabel("Fahrenheit: ");

        JTextField celsiusField = new JTextField(15);
        JTextField fahrenheitField = new JTextField(15);
        celsiusField.setEditable(false);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(e -> {
            try {
                double fahrenheit = Double.parseDouble(fahrenheitField.getText().strip());
                double celsius = (fahrenheit - 32) * 5 / 9;
                celsiusField.setText(String.valueOf(celsius));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Enter numerical input",
                        "Invalid entry", JOptionPane.ERROR_MESSAGE);
            }
        });
        frame.setLayout(new FlowLayout());
        frame.add(fahrenheitLabel);
        frame.add(fahrenheitField);
        frame.add(celsiusLabel);
        frame.add(celsiusField);
        frame.add(convertButton);

        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}