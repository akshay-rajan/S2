// 1. Program to draw Circle, Rectangle, Line in Applet.

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Applets extends Applet implements Runnable {
    
    Thread t;

    public void init() {
        // Initialization code if needed
        t = new Thread(this);
        t.start(); // Start the animation thread
    }

    public void start() {
        // Start the animation thread
    }

    public void stop() {
        // Cleanup code if needed
        t = null;
    }

    public void run() {
        // Animation code if needed
        while (t != null) {
            try {
                Thread.sleep(100);
                repaint();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void paint(Graphics g) {
        // Draw a circle
        g.setColor(Color.RED);
        g.fillOval(20, 20, 50, 50);

        // Draw a rectangle
        g.setColor(Color.GREEN);
        g.fillRect(100, 20, 80, 50);

        // Draw a line
        g.setColor(Color.BLUE);
        g.drawLine(200, 20, 300, 70);
    }
}