package sk.stuba.uim.fei.oop;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashSet;
import java.util.Iterator;

public class TestCanvas extends Canvas {

//mnozina objektov
    public HashSet<Rectangle> OurObject = new HashSet<Rectangle>();

    public void NewObjects(){
        int i=0;
        int j=20;
        while(i<5){
            //vytvorime novy objekt
            OurObject.add(new Rectangle(10,j,20,20));
            j+=30;
            i++;
        }
    }

    public void paint(Graphics g){

      for(Rectangle  ActRect : OurObject){
          g.drawRect(ActRect.x, ActRect.y, ActRect.width, ActRect.height);
      }

    }


}
