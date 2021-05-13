package sk.stuba.uim.fei.oop;

import javax.swing.*;

public class TestMouse {
    public static void main(String args[]){
        JFrame okno  = new JFrame();
        okno.add(new TestCanvas());
        okno.setSize(200,200);
        okno.setVisible(true);

    }

}