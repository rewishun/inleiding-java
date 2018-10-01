package h06;

import java.applet.*;
import java.awt.*;

public class opdracht3 extends Applet {
    int hoogsteint;
    double antwoord;

    public void init() {
        hoogsteint = 2147483647;
        antwoord = hoogsteint + hoogsteint;
    }
    public void paint (Graphics g) {
        g.drawString("2147483647+2147483647= " + antwoord,20,20);


    }
}