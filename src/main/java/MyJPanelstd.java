
import java.awt.*;
import javax.swing.*;

public class MyJPanelstd extends JPanel {

    MyJPanel1 mjp1;
    MyJPanel2 mjp2;
    MyJPanel3 mjp3;
    MyJPanel4 mjp4;

    public MyJPanelstd() {
        mjp1 = new MyJPanel1();
        mjp2 = new MyJPanel2(mjp1);
        mjp3 = new MyJPanel3();
        mjp4 = new MyJPanel4();

//------------------------------------------------------
// Choose a Layout for JPanel and 
// add components to Jpanel according to layout    	
        setLayout(new GridLayout(2, 2));
        add(mjp1);
        add(mjp2);
        add(mjp3);
        add(mjp4);

    }

}
