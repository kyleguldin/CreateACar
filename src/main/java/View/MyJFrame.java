package View;


import java.awt.*;
import javax.swing.*;

public class MyJFrame extends JFrame {

    MyJPanelstd mjp;

    public MyJFrame() {
        super("Kyle's Cars");
//------------------------------------------------------
// Create components
        mjp = new MyJPanelstd();
//------------------------------------------------------
// Choose a Layout for JFrame and 
// add Jpanel to JFrame according to layout    	
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(mjp, "Center");
//------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(10000, 1000);
        setVisible(true);
    }
}
