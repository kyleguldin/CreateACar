package Controller;


import View.MyJPanel1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class GrayActionListener implements ActionListener {

    private MyJPanel1 jp;
    private ImageIcon image1;
    private JLabel label1;
    private ImageIcon image2;
    private JLabel label2;
    private ImageIcon image3;
    private JLabel label3;
    private JButton button;
    private JPanel panel;

    public GrayActionListener(MyJPanel1 jp) {
        this.jp = jp;
    }

    public void actionPerformed(ActionEvent e) {

// image3 = new ImageIcon(getClass().getResource("IST261TruckOutline.PNG"));
//      label3 = new JLabel(image3);
//     jp.add(label3);
        this.jp.SedanDefault();
    }

}
