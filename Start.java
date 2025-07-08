import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start {

    public static void main(String[] args) {
        //MENÜ-ERSTELLUNG
        JMenuBar meinMenue = new JMenuBar();                    //ERSTELLT EINE MENÜLEISTE
        JMenu datei = new JMenu("Datei");                    //ERSTELLT MENÜEINTRAG "DATEI"
        JMenuItem close = new JMenuItem("Beenden");        //ERSTELLT EINTRAG "BEENDEN" ALS DROPDOWN

        //GUI-ERSTELLUNG
        datei.add(close);                                       //EINTRAG IN DROP-DOWN AUFNEHMEN
        meinMenue.add(datei);                                   //DROP_DOWN ZU MENÜLEISTE HINZUFÜGEN
        JFrame meins = new JFrame("Mein erstes GUI");       //ERSTELLT GUI
        meins.setJMenuBar(meinMenue);

        //GUI-EINSTELLUNG
        meins.setSize(1024, 768);                   //STELLT GRÖßE EIN
        meins.setResizable(false);                              //STELLT EIN OB BENUTZER FENSTER VERÄNDERN KANN
        meins.setLocationRelativeTo(null);                      //ZENTRIERT DAS FENSTER AUF DEM BILDSCHIRM

        //GUI-INHALT
        meins.add(new JLabel("Hello World!"));              //FÜGT TEXT HINZU


        meins.setVisible(true);                                 //SICHTBARKEIT

        meins.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //SCHLIEßT DAS FENSTER WENN MAN AUF X DRÜCKT

        //FENSTER ÜBER "BEENDEN" BEENDEN
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

}
