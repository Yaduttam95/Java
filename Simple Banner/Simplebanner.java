import java.awt.*;
import java.applet.*;

<applet code = "Simplebanner" width = 1200 height = 1400>
</applet>
public class Simplebanner extends Applet implements Runnable {
    String msg = "Poornima Group of Institution                            ";
    Thread t = null;
    char ch;
    int state;
    boolean flag;

    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    public void start() {
        t = new Thread(this);
        flag = false;
        t.start();
    }

    public void run() {
        // char ch;
        for (;;) {
            try {
                repaint();
                Thread.sleep(250);
                ch = msg.charAt(0);
                msg = msg.substring(1, msg.length());
                msg += ch;
                if (flag)
                    break;
            } catch (InterruptedException ex) {
                System.out.println("Error " + ex);
            }
        }
    }

    public void stop() {
        flag = true;
        t = null;
    }

    public void paint(Graphics g) {
        g.drawString(msg, 40, 40);
    }
}
