package labtwo.java;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LabTwo {

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
   

    public Panel() {
        this.setBackground(Color.RED);
        new Thread(this).start();
        x = 100;
       
    }

    @Override
    public void run() {

        while (true) {

            try {
                this.repaint();
                Thread.sleep(100);
                x+=10;

            } catch (InterruptedException e) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(x>this.getWidth())
        {
            x=0;
        }


       g.drawString("yaaaw", x, 100);
    }
}
