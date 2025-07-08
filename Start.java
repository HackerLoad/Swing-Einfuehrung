import javax.swing.*;

public class Start {

    public static void main(String[] args) {
        JMenuBar meinMenue = new JMenuBar();                    //ERSTELLT EINE MENÜLEISTE
        JMenu datei = new JMenu("Datei");                    //ERSTELLT MENÜEINTRAG "DATEI"
        JMenuItem close = new JMenuItem("Beenden");        //ERSTELLT EINTRAG "BEENDEN" ALS DROPDOWN

        datei.add(close);
        meinMenue.add(datei);
        JFrame meins = new JFrame("Mein erstes GUI");       //ERSTELLT GUI
        meins.setSize(1024, 768);                   //STELLT GRÖßE EIN
        meins.setResizable(false);                              //STELLT EIN OB BENUTZER FENSTER VERÄNDERN KANN
        meins.setLocationRelativeTo(null);                      //ZENTRIERT DAS FENSTER AUF DEM BILDSCHIRM

        meins.add(new JLabel("Hello World!"));              //FÜGT TEXT HINZU

        meins.setJMenuBar(meinMenue);
        meins.setVisible(true);                                 //SICHTBARKEIT

        meins.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //SCHLIEßT DAS FENSTER WENN MAN AUF X DRÜCKT

    }

}
