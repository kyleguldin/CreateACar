package View;


import java.awt.*;
import javax.swing.*;

public class MyJPanel3 extends JPanel {

    public MyJPanel3() {
        setBackground(Color.DARK_GRAY);
        JButton jb1 = new JButton("Gray");
        jb1.setPreferredSize(new Dimension(100, 100));
        jb1.setBackground(Color.WHITE);
        jb1.setForeground(Color.GRAY);
        add(jb1);
        JButton jb2 = new JButton("Red");
        jb2.setPreferredSize(new Dimension(100, 100));
        jb2.setBackground(Color.WHITE);
        jb2.setForeground(Color.RED);
        add(jb2);
        JButton jb3 = new JButton("Blue");
        jb3.setPreferredSize(new Dimension(100, 100));
        jb3.setBackground(Color.WHITE);
        jb3.setForeground(Color.blue);
        add(jb3);
    }
}
