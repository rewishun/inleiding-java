package h04;

import java.awt.*;
import java.applet.*;

public class praktijkopdrachthoofdsuk4 extends Applet {

    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("Rechte lijn", 50, 60 );
        g.setColor(Color.black);
        g.drawLine(50,45,110,45);
        g.setColor(Color.black);
        g.drawRect(50,100,125,50);
        g.drawString("rechthoek",50,165);
        g.setColor(Color.magenta);
        g.fillRect(200,100,110,55);
        g.setColor(Color.black);
        g.drawOval(200,100,110,55);
        g.drawString("gevulde rechthoek met een ovaal",200,175);
        g.setColor(Color.magenta);
        g.fillArc(475, 100, 100, 100, 45, 45);
        g.setColor(Color.black);
        g.drawOval(475,100,100,100);
        g.drawString("taartpunt met een ovaal eromheen",475,215);
        g.setColor(Color.black);
        g.drawRoundRect(50,250,150,75,10,10);
        g.drawString("rechthoek met afgeronde hoeken",50,340);
        g.setColor(Color.magenta);
        g.fillOval(275,250,115,75);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal",275,340);
        g.setColor(Color.black);
        g.drawOval(475,250,100,100);
        g.drawString("cirkel",475,365);


    }
}