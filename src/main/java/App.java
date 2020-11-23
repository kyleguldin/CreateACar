
import View.MyJFrame;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


// test

public class App extends JFrame {

    private ImageIcon image1;
    private JLabel label1;
    private ImageIcon image2;
    private JLabel label2;
    private ImageIcon image3;
    private JLabel label3;
    private JButton button;
    private JPanel panel;

    App() {
        setLayout(new FlowLayout());
        image1 = new ImageIcon(getClass().getResource("Images/IST261SedanOutline.PNG"));
        label1 = new JLabel(image1);
        add(label1);

        image3 = new ImageIcon(getClass().getResource("Images/IST261TruckOutline.PNG"));
        label3 = new JLabel(image3);
        add(label3);

    }

    public static void main(String[] args) {

        //    app gui = new app();
        //  gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //gui.setVisible(true);
        //  gui.pack();
        MyJFrame mjf = new MyJFrame();
    }
}