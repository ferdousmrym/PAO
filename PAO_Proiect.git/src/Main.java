import javax.swing.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, IllegalAccessException, InstantiationException {
        UIManager.setLookAndFeel(UIManager. getSystemLookAndFeelClassName());

//        MyGUIForm myGUIForm = new MyGUIForm();
//        myGUIForm.setVisible(true);
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
                    public  void run()
            {
                MyGUIForm myGUIForm = new MyGUIForm();
                myGUIForm.setVisible(true);
            }
        }
        );
    }
}
