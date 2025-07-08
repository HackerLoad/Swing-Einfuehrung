import javax.swing.*;

public class Start {

    public static void main(String[] args) {
        JFrame meins = new JFrame("Mein erstes GUI");       //ERSTELLT GUI
        meins.setSize(1024, 768);                   //STELLT GRÖßE EIN
        meins.setResizable(false);                              //STELLT EIN OB BENUTZER FENSTER VERÄNDERN KANN
        meins.setLocationRelativeTo(null);                      //ZENTRIERT DAS FENSTER AUF DEM BILDSCHIRM

        meins.add(new JLabel("Hello World!"));              //FÜGT TEXT HINZU

        meins.setVisible(true);                                 //SICHTBARKEIT

    }

}
