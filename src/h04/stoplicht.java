package h04;

import java.awt.*;
import java.applet.*;

public class stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRect(50, 100, 300, 100);
        g.setColor(Color.green);
        g.fillOval(55,110,75,75);
        g.setColor(Color.orange);
        g.fillOval(150,110,75,75);
        g.setColor(Color.red);
        g.fillOval(250,110,75,75);


    }
}

