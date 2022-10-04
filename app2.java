import java.applet.*;
import java.awt.*;

//<applet code = "app2" width = 1800 height = 800>
//</applet>

public class app2 extends Applet{

    Font f1,f2,f3;

    public void init(){
        f1 = new Font("Arial",Font.BOLD,30);    
        f2 = new Font("Forte",Font.PLAIN,30);    
        f3 = new Font("Elephant",Font.ITALIC,30); 

        Color c1 = new Color(255, 255, 255);
        setBackground(c1);
    }
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString("Yaduttam", 100, 100);

        g.setFont(f2);
        g.drawString("Yaduttam", 200, 200);

        g.setFont(f3);
        g.drawString("Yaduttam", 300, 300);

        g.drawRect(500, 500, 100, 100);
    }
}