package View;


import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyJPanel4 extends JPanel {

    public MyJPanel4() {
        setBackground(Color.DARK_GRAY);
        JButton jb1 = new JButton("Finalize");
        jb1.setPreferredSize(new Dimension(100, 100));
        jb1.setBackground(Color.WHITE);
        jb1.setForeground(Color.DARK_GRAY);
        add(jb1);

        JLabel cost = new JLabel("Cost: ", JLabel.CENTER);
        cost.setForeground(Color.white);
        cost.setPreferredSize(new Dimension(100, 100));
        add(cost);
    }
}
