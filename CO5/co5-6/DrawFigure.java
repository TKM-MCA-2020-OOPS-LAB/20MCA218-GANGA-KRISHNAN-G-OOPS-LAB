import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;

public class DrawFigure extends Applet implements ItemListener {

    Choice choice1;
    int Select; 
    

    public void init()
    {

         setBackground(Color.GREEN);
         Label l1;
         l1 = new Label("*********CHOOSE SHAPE THAT YOU WANT TO DRAW ************");    
         l1.setBounds(30, 100, 100, 30);    
        choice1 = new Choice();
        choice1.addItem("SELECT SHAPE");
        choice1.addItem("RECTANGLE");
        choice1.addItem("SQUARE");
        choice1.addItem("CIRCLE");
        choice1.addItem("TRIANGLE");
        add(choice1);
        choice1.addItemListener(this);
        choice1.setBackground(Color.yellow);
        choice1.setBounds(70,500,500,100);
        add(l1);
    }

 public void itemStateChanged (ItemEvent e)
    {
         
         Select = choice1.getSelectedIndex();
         repaint();
    }

 public void paint(Graphics g)
	{
g.setColor(Color.red);  
         super.paint(g);

         if (Select == 1)
         {  
             
             g.drawRect(80, 180, 400, 180);
             g.setColor(Color.yellow);
             g.fillRect(80,180,400,180);
         }
         if (Select == 2)
         {
        	 g.drawRect(100,100,200,200);
                 g.setColor(Color.yellow);
                 g.fillRect(100,100,200,200);
         }
         if (Select == 3)
         {
             
             g.drawOval(150,150,400,400);
	     g.setColor(Color.red);
	     g.fillOval(150,150,400,400);
         }
         if (Select ==4)
         {
             g.drawLine(120, 130, 280, 130);
             g.drawLine(120, 130, 200, 65);
             g.drawLine(200, 65, 280, 130);
         }
	}
}

/* 
<applet code="DrawFigure.class" width="700" height="700" border="7"> 
</applet> 
*/  