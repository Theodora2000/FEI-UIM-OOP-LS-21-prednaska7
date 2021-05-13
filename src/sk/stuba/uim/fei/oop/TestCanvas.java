package sk.stuba.uim.fei.oop;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashSet;
import java.util.Iterator;

public class TestCanvas extends Canvas implements MouseListener{

    public RectangleButtons button;
    //mnozina objektov
    public HashSet<Rectangle> OurObject = new HashSet<Rectangle>();


    public TestCanvas(RectangleButtons button){
        super();
        addMouseListener(this);
        this.button = button;
    }


    public void paint(Graphics g){

      for(Rectangle  ActRect : OurObject){
          g.drawRect(ActRect.x , ActRect.y , ActRect.width, ActRect.height);
      }

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if(button.WannaRect) {
            OurObject.add(new Rectangle(e.getX(), e.getY(), 20, 20));
            repaint();
            button.WannaRect=false;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
