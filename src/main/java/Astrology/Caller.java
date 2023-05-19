package Astrology;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Caller {
    public static void main(String[] args) {
//        Form obj = new Form()
        CallingFrame df = new CallingFrame();
    }
}

class CallingFrame extends JFrame{
    public CallingFrame(){

        JButton button = new JButton("Click Here to find out your Zodiac Sign!");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Form();
                dispose();
            }
        });

        add(button);
        setSize(300,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
//    public CallingImage(){
//
//        Form form = new Form();

//        form.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//               new ImageAdder();
//                dispose();
//            }
//        });

//        add(ImageAdder);
//        setSize(300,400);
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//    }

}
