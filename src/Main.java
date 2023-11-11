import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

        ImageIcon image = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        myFrame.add(new MyLabel(image, border));
        myFrame.pack();
    }
}