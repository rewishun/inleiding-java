package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht2 extends Applet {
    int mannen;
    int vrouwen;
    int leerlingman;
    int leerlingvrouw;
    int totaal;

    Label manlabel;
    Label vrouwlabel;
    Label vrouwlijkeleerlinglabel;
    Label manlijkeleerlinglabel;
    Label totaallabel;

    Button mannenknop;
    Button vrouwenknop;
    Button mannelijkeleerlingenknop;
    Button vrouwlijkeleerlingenknop;

    public void init() {
        // Random dingen
        setSize(500, 400);


        // Mannen knop
        mannenknop = new Button("1+ Man");
        KnopListener kl = new KnopListener();
        mannenknop.addActionListener(kl);
        manlabel = new Label();

        // Totaal label
        totaallabel = new Label();

        // Vrouwen Knop
        vrouwenknop = new Button("1+ Vrouw");
        KnopListener2 kl2 = new KnopListener2();
        vrouwenknop.addActionListener(kl2);
        vrouwlabel = new Label();

        // Mannelijkeleerlingen knop
        mannelijkeleerlingenknop = new Button("1+ Mannelijke leerling");
        KnopListener3 kl3 = new KnopListener3();
        mannelijkeleerlingenknop.addActionListener(kl3);
        manlijkeleerlinglabel = new Label();

        // Vrouwlijke leerlingen knop
        vrouwlijkeleerlingenknop = new Button("1+ Vrouwlijke leerling");
        KnopListener4 kl4 = new KnopListener4();
        vrouwlijkeleerlingenknop.addActionListener(kl4);
        vrouwlijkeleerlinglabel = new Label();


        // Knoppen toevoegen
        add(mannenknop);
        add(vrouwenknop);
        add(mannelijkeleerlingenknop);
        add(vrouwlijkeleerlingenknop);
        add(manlabel);
        add(vrouwlabel);
        add(manlijkeleerlinglabel);
        add(vrouwlijkeleerlinglabel);
        add(totaallabel);
    }

    public void paint(Graphics g) {
        manlabel.setLocation(30, 60);
        vrouwlabel.setLocation(100, 60);
        manlijkeleerlinglabel.setLocation(200, 60);
        vrouwlijkeleerlinglabel.setLocation(350, 60);
        totaallabel.setLocation(250, 200);
        totaallabel.setSize(100,50);
        manlabel.setSize(50,50);
        vrouwlabel.setSize(100,50);
        vrouwlijkeleerlinglabel.setSize(100,50);
        manlijkeleerlinglabel.setSize(100,50);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannen++;
            totaal++;
            manlabel.setText("" + mannen);
            totaallabel.setText("Totaal: " + totaal);

        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwen++;
            totaal++;
            vrouwlabel.setText("" + vrouwen);
            totaallabel.setText("Totaal: " + totaal);
        }
    }

    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            leerlingman++;
            totaal++;
            manlijkeleerlinglabel.setText("" + leerlingman);
            totaallabel.setText("Totaal: " + totaal);

        }
    }
    class KnopListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            leerlingvrouw++;
            totaal++;
            vrouwlijkeleerlinglabel.setText("" + leerlingvrouw);
            totaallabel.setText("Totaal: " + totaal);

        }
    }
}