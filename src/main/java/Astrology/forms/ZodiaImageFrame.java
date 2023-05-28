package Astrology.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZodiaImageFrame extends JFrame {
    public ZodiaImageFrame() {

        // Adding images
        JLabel welcomeImage = new JLabel();
        welcomeImage.setIcon(new ImageIcon("C:\\dev\\personalProjects\\Astrology\\src\\main\\java\\Astrology\\images\\Aquarius.png"));
        welcomeImage.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel ImagePanel = new JPanel();
        ImagePanel.add(welcomeImage);
        add(ImagePanel);
        setSize(800, 600); // google how to wrap a button
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}