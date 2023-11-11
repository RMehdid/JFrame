import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JLabel {

    ImageIcon image;
    Border border;
    MyLabel(ImageIcon image, Border border) {
        this.setText("Bro, do you even code?");
        this.setForeground(Color.green);
        this.setFont(new Font("MV Boli",Font.PLAIN, 50));
        this.setIcon(image);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setIconTextGap(20);
        this.setBackground(Color.black);
        this.setOpaque(true);
        this.setBorder(border);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
    }
}
