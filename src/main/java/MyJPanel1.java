
import java.awt.*;
import javax.swing.*;

public class MyJPanel1 extends JPanel {

    private ImageIcon image1;
    private JLabel label1;
    private ImageIcon image2;
    private JLabel label2;
    private ImageIcon image3;
    private JLabel label3;
    private JButton button;
    private JPanel panel;

    public MyJPanel1() {
        setBackground(Color.DARK_GRAY);
        setLayout(new GridLayout(2, 0));
        setSize(10000, 10000);
        image1 = new ImageIcon(getClass().getResource("IST261SedanOutline.PNG"));
        label1 = new JLabel(image1);

        add(label1);

        image3 = new ImageIcon(getClass().getResource("IST261TruckOutline.PNG"));
        label3 = new JLabel(image3);
        add(label3);

    }

    public void truckDefault() {
        label1.setVisible(false);
        label3.setVisible(true);
    }

    public void SedanDefault() {
        label3.setVisible(false);
        label1.setVisible(true);

    }
}
