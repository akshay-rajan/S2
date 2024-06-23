import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyFrame() {
        // Configure the frame
        this.setTitle("JFrame Title");
        this.setVisible(true);
        this.setSize(420, 420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // Change logo at the top left
        ImageIcon logo = new ImageIcon("../../Others/favicon2.png");
        this.setIconImage(logo.getImage());

        // Background Color (HEX or RGB)
        this.getContentPane().setBackground(new Color(0x123456));
    }

    public static void main(String[] args) {
        
        // We can avoid naming, if we are not modifying the frame here
        new MyFrame();

    }
    
}
