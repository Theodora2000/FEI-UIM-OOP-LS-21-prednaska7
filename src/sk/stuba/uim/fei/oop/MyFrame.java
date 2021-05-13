package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {

    public MyFrame(String name){
        super(name);

        setSize(400,200);
        setVisible(true);
        //v objekte prepisem  metodu
        addWindowListener(new WindowAdapter()
                          {
                              public void windowClosing(WindowEvent e){
                                  System.exit(0);
                              }
                          }
        );


    }
}
