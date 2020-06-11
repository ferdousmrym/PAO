import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIForm extends JFrame {
    private JButton mybutton;
    private JTextArea MytextArea;
    private JPanel rootPanel;

    public  MyGUIForm(){

        add(rootPanel);
        setTitle("The GUI");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel, "Hi, Have a good day!");
            }
        });
    }

}
