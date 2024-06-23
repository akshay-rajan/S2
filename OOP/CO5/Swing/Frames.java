import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frames {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();

        // Configure the frame
        frame.setTitle("JFrame Title");
        frame.setVisible(true);
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // Change logo at the top left
        ImageIcon logo = new ImageIcon("../../Others/favicon2.png");
        frame.setIconImage(logo.getImage());

        // Background Color (HEX or RGB)
        frame.getContentPane().setBackground(new Color(0x123456));

    }
    
}
