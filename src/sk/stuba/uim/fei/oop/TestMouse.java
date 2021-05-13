package sk.stuba.uim.fei.oop;

import javax.swing.*;

public class TestMouse {
    public static void main(String args[]){

        JFrame okno  = new JFrame("Stvorce");
        okno.setSize(200,200);
        TestCanvas can = new TestCanvas();
        can.NewObjects();
        okno.add(can);
        okno.setVisible(true);

    }

}