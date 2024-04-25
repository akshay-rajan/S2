import java.awt.*;

public class AWT1 extends Frame {
    
    AWT1() {

        Button b = new Button("Click Me!");
        b.setBounds(30, 100, 80, 30);
        add(b);

        setSize(300, 300);
        setTitle("AWT Example");
        setLayout(null);

        setVisible(true);

    }

    public static void main(String[] args) {
        
        AWT1 frame = new AWT1();
    }

}
