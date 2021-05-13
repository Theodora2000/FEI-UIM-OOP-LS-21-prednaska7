package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleButtons extends JButton implements ActionListener {

    public boolean WannaRect;

    public RectangleButtons(String label){
        super(label);
        addActionListener(this);
        WannaRect = false;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I wanna a square");
        WannaRect = true;
    }
}
