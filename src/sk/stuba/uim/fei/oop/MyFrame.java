package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String name){
        super(name);
        JPanel p = new JPanel();
        RectangleButtons b = new RectangleButtons("Draw");
        p.add(b);
        add(BorderLayout.NORTH, p);
        TestCanvas c = new TestCanvas(b);
        add(BorderLayout.CENTER, c);
        setSize(200,200);
        setVisible(true);


    }
}
