package Astrology;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame{
    public JPanel panelMain;
    private JTextField textName;
    private JButton button;
    private JTextField enterSName;
    private JLabel enterName;
    public JLabel birthdate;
    private JCheckBox spaghettiCheckBox;
    public JList yearList;
    private JList list1;
    public JList Day;
    public JLabel Month;

    public Form() {
//        Form form = new Form();
        this.setContentPane(this.panelMain);
        this.setTitle("title");
        this.setBounds(300,400,200,400);
        //form.setSize(300,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(button,textName.getText()+ ",Hello");
            }
        });
    }

    public static void main(String[] args) {
        Form form = new Form();
        form.setContentPane(form.panelMain);
        form.setTitle("title");
        form.setBounds(300,400,200,400);
        //form.setSize(300,400);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JFrame getFrame(){
        return this;
    }
}
