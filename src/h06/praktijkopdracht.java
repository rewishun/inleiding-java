package h06;


import java.applet.*;
import java.awt.*;

public class praktijkopdracht extends Applet  {
    double cijfer1, cijfer2, cijfer3,gemiddelde,getal;

    public void init () {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        getal = 3;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) /getal;
    }
    public void paint (Graphics g) {
        gemiddelde = gemiddelde * 10;
        int gemInt = (int) gemiddelde;
        gemiddelde = (double) gemInt;
        gemiddelde = gemiddelde / 10;
        g.drawString("cijfers: 5,9  6,3  6,9" ,20,20);
        g.drawString("Het gemiddelde is: " + gemiddelde,20,40);


    }
}
