package h06;

import java.awt.*;
import java.applet.*;


public class opdracht1 extends Applet {
    double a, b;
    double uitkomst;


    public void init() {
        a = 113.0;
        b = 4.0;

        uitkomst = a /b ;
    }

    public void paint(Graphics g) {
        g.drawString("iedereen krijgt precies=$ " + uitkomst, 20, 20);
    }
}