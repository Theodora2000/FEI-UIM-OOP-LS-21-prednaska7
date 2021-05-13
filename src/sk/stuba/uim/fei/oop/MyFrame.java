package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String name){
        super(name);

        setSize(400,200);
        setVisible(true);
        addWindowListener(new Closer());


    }
}
