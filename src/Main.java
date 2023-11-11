import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("ExempleSimple");

        // Création du container
        JPanel panel = new JPanel();

        // Définition du gestionnaire de placement
        panel.setLayout(new GridLayout(1,2));

        // Création des composants
        JLabel label = new JLabel("Entrer votre nom");
        JTextField textField = new JTextField("toto");

        // Ajout des composants au container
        panel.add(label);
        panel.add(textField);

        // Ajout du container à la fenêtre
        frame.getContentPane().add(panel);

        // Afficher la fenêtre
        frame.pack();
        frame.setVisible(true);
    }
}