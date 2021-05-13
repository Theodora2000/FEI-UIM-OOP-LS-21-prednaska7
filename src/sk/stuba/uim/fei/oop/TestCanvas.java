package sk.stuba.uim.fei.oop;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TestCanvas extends Canvas implements MouseListener, MouseMotionListener {


    public TestCanvas(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }



    @Override
    //klikne a pusti na tom istom mieste
    public void mouseClicked(MouseEvent e) {
        System.out.println(e);
        System.out.println("Mouse clicked (" + e.getX() +", "+ e.getY()+")");
    }

    @Override
    //ked sa mis stlaci
    public void mousePressed(MouseEvent e) {
        System.out.println("som stlacena a hybem sa (" + e.getY() +", " +e.getY()+")");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(e);
    }

    @Override
    //ziseil na canvas
    public void mouseEntered(MouseEvent e) {
        System.out.println(e);
    }

    @Override
    //odisiel z canvasu
    public void mouseExited(MouseEvent e) {
        System.out.println(e);
    }

    @Override
    //ked je stlacene a posuvame ho
    public void mouseDragged(MouseEvent e) {
        System.out.println(e);

    }

    @Override
    //ked sa surdnice x,y zmenia
    public void mouseMoved(MouseEvent e) {
        System.out.println("hybem sa (" + e.getY() +", " +e.getY()+")");
    }
}
