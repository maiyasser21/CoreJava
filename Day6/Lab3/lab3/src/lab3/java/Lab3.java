package lab3.java;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab3 {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("mai's frame");
        Panel p = new Panel();
        f.setContentPane(p);
        f.setSize(400, 200);
        f.setVisible(true);

    }
}

class Panel extends JPanel implements Runnable {

    int x;
    int y;
    int dx;
    int dy;

    public Panel() {
        this.setBackground(Color.RED);
        new Thread(this).start();
        x = 100;
        y = 100;
        dx = 5;
        dy = 5;
    }

    @Override
    public void run() {

        while (true) {

            try {
                this.repaint();
                Thread.sleep(100);

            } catch (InterruptedException e) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (y + dy > this.getHeight()-20 || y+dy < 0) {
            dy = -dy;
        }
        if (x + dx > this.getWidth()-20 || x+dx < 0) {
            dx = -dx;

        }
        x += dx;
        y += dy;

        g.drawOval(x, y, 20, 20);
        g.setColor(Color.black);
        g.fillOval(x, y, 20, 20);
    }
}
