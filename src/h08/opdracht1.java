package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class opdracht1 extends Applet {
    TextField tekstsvak;
    Button knop;
    Button wisknop;
    String schermtekst;
    Label label;

    public void init() {
        schermtekst = new String();
        knop = new Button();
        knop.setLabel("Oke");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        wisknop = new Button("wis");
        ResetListener rl = new ResetListener();
        wisknop.addActionListener( rl );
        add(wisknop);
        tekstsvak = new TextField("" , 20);
        label = new Label();
        schermtekst = "";
        add(label);
        add(tekstsvak);
        getGraphics().drawString("uw getal=",50,70);


    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50 ,60);

    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = tekstsvak.getText();
            repaint();
        }
    }
    class ResetListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstsvak.setText(" ");
            repaint();
        }
    }
}