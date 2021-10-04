package pp2.pkg19;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.*;   


public class Pp219 extends Applet {
    public void paint (Graphics page)
    {  
        int x =0;
        int y=0;
        int width = 500;
        int height = 250;
        page.setColor(Color.blue);
        page.fillRect(x,y,width,height);
        page.setColor(Color.orange);
        Font f = new Font("Helvetica", Font.BOLD, 26);
        page.setFont(f);
        page.drawString("Nate", 300, 100);
        Font g = new Font("Helvetica", Font.PLAIN, 18);
        page.setFont(g);
        page.drawString("Card", 320, 120);
        Font h = new Font("serif", Font.ITALIC, 15);
        page.setFont(h);
        page.drawString("nate@gmail.com", 320, 140);
        final int MID = 350;
        final int TOP = 168;
        page.setColor(Color.orange);
        page.fillOval(MID, TOP, 60, 60);
        page.setColor(Color.blue);
        Font i = new Font("serif", Font.BOLD, 20);
        page.setFont(i);
        page.drawString("", MID+20, TOP+30);
    }
}