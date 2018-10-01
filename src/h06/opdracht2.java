package h06;

import java.awt.*;
import java.applet.*;


public class opdracht2 extends Applet {
    double a, b, c, d, e, f;
    double uitkomst;
    double berekening;
    double twee;


    public void init() {
        a = 60;
        b = 60;
        c = 3600;
        d = 24;
        e = 86400;
        f = 365;

        uitkomst = (a * b);
        berekening = (c * d);
        twee = ( e * f);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("de berekening gaat als volg: 60 seconden x 60 minuten." +
                " in een uur zitten zoveel seconden= " + uitkomst, 20, 20);
        g.drawString("de bereknening gaat als volg: 3600 seconden x 24 uur." +
                " in een dag zitten zoveel seconden=" + berekening, 20,40);
        g.drawString("de berekeking gaat als volg: 86400 seconden x 365 dagen." +
                "in een jaar zitten=" +twee, 20, 60);
    }
}