import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField Celsiustext;
    private JLabel CelsiusLabel;
    private JButton ConvertButton;
    private JLabel FahrenheitLabel;

    public CelsiusConverterGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        ConvertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int)((Double.parseDouble((Celsiustext.getText())))
                        *1.8 + 32);
                FahrenheitLabel.setText(tempFahr +"Fahrenheit");
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new CelsiusConverterGUI("Celsius Converter");
        frame.setVisible(true);

    }
}
