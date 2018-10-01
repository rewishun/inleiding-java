package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht1 extends Applet {
    TextField tekstvak;
    Button knop;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
        knop = new Button("wis");
        add(knop);
        setLocation(100,50);
    }

    public void paint(Graphics g) {
        g.drawString("Type een hele lange tekst " +
                "in het tekstvakje " +
                "en klik op Ok", 50, 100 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {

            tekstvak =  new TextField("", 30);
        }
    }
}