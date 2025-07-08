import javax.swing.*;

public class Start {

    public static void main(String[] args) {
        JFrame meins = new JFrame("Mein erstes GUI");       //ERSTELLT GUI
        meins.setSize(1024, 768);                   //STELLT GRÖßE EIN

        meins.add(new JLabel("Hello World!"));              //FÜGT TEXT HINZU

        meins.setVisible(true);                                 //SICHTBARKEIT

    }

}
