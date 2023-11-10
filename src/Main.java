import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

        ImageIcon image = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli",Font.PLAIN, 50));
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setIconTextGap(20);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100, 100, 250, 250);

        myFrame.add(label);
//        myFrame.setLayout(null);
        myFrame.pack();
    }
}