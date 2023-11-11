import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame();

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 100, 100);
        redPanel.setLayout(null);
        myFrame.add(redPanel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(100, 0, 100, 100);
        bluePanel.setLayout(null);
        myFrame.add(bluePanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 100, 200, 100);
        greenPanel.setLayout(null);
        myFrame.add(greenPanel);

//        ImageIcon image = new ImageIcon("logo.png");
//        Border border = BorderFactory.createLineBorder(Color.green, 3);
//        myFrame.add(new MyLabel(image, border));
//        myFrame.pack();
    }
}