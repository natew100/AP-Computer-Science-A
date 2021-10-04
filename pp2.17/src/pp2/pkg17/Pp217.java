package pp2.pkg17;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.*;   

public class Pp217 extends Applet {
    public void paint (Graphics frame)
    {  
        setBackground (Color.blue);
        frame.setColor (Color.gray);
        frame.fillRect (0, 350, 500, 150) ;
        frame.setColor (Color.white);
        frame.fillOval (225, 205, 50, 50);
        frame.fillOval (210, 245, 80, 60);
        frame.fillOval (195, 295, 110, 80);
        frame.setColor (Color.black);
        frame.fillOval (235, 215, 10, 10);
        frame.fillOval (250, 215, 10, 10);
        frame.drawLine (240, 235, 255, 235);
        frame.drawLine (220, 275, 180, 260);
        frame.drawLine (280, 275, 320, 290);
        frame.drawLine (220, 210, 280, 210);
        frame.fillRect (230, 175, 40, 35);
        frame.setColor (Color.yellow);
        frame.fillOval (20, 20, 50, 50);
    }
}