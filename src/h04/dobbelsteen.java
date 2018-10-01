package h04;

import java.awt.*;
import java.applet.*;

public class dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRoundRect(100, 100, 200, 200, 15, 15);
        g.setColor(Color.black);
        g.fillOval(120,120,50,50);
        g.setColor(Color.black);
        g.fillOval(220,120,50,50);
        g.setColor(Color.black);
        g.fillOval(120,220,50,50);
        g.setColor(Color.black);
        g.fillOval(220,220,50,50);
    }
}