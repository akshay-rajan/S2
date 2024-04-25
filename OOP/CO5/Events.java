// 7. Develop a program to handle all mouse events and window events

import java.awt.*;
import java.awt.event.*;


public class Events extends Frame implements MouseListener, WindowListener {
    
    Events() {
        addMouseListener(this);
        addWindowListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);   
    }

    // * MouseListener
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at " + e.getX() + ", " + e.getY());
    }
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered the frame");
    }
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited the frame");
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse button pressed");
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse button released");
    }

    // * WindowListener
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated");
    }
    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed");
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing");
        dispose();
    }
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated");
    }
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window deiconified");
    }
    public void windowIconified(WindowEvent e) {
        System.out.println("Window iconified");
    }
    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened");
    }

    public static void main(String[] args) {
        new Events();
    }

}
