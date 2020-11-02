
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyJPanel2 extends JPanel {

    private MyJPanel1 jp;

    public MyJPanel2(MyJPanel1 jp) {

        this.jp = jp;
        setBackground(Color.DARK_GRAY);

        JButton jb1 = new JButton("Truck");
        jb1.setPreferredSize(new Dimension(100, 100));
        jb1.setLocation(0, 0);
        jb1.setBackground(Color.WHITE);
        jb1.setForeground(Color.DARK_GRAY);
        add(jb1);
        JButton jb2 = new JButton("Sedan");
        jb2.setLocation(100, 300);
        jb2.setPreferredSize(new Dimension(100, 100));
        jb2.setBackground(Color.WHITE);
        jb2.setForeground(Color.DARK_GRAY);
        add(jb2);

        MyActionListener truck = new MyActionListener(this.jp);
        jb1.addActionListener(truck);

        SedanActionListener sedan = new SedanActionListener(this.jp);
        jb2.addActionListener(sedan);

    }

//    private static class Actionbut1 extends myJPanel1 {
//  private ImageIcon image;
//  private JLabel label;
//  private ImageIcon image2;
//  private JLabel label2;
//        public Actionbut1(ActionEvent jb1) {
//            this.jp.test();
//           image = new ImageIcon(getClass().getResource("IST261TruckOutline.PNG"));
//      label = new JLabel(image);
//      
//      myJPanel1.add(label);
//     
//      
//        }
//
//        
//    }
}
