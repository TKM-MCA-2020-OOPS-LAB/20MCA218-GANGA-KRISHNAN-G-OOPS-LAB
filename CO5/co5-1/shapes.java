import java.awt.Color;
import java.applet.Applet;
import java.awt.Graphics;
/* <applet code = "shapes.class" width = "500" height = "700"></applet>*/
public class shapes extends Applet{
public void paint(Graphics g){
g.setColor(Color.red);		
g.drawLine(30,30, 300, 30);
g.drawRect(120,100,270,150);
g.setColor(Color.yellow);
g.fillRect(120,100,270,150);
g.drawOval(300,300,300,300);
g.setColor(Color.green);
g.fillOval(300,300,300,300);
}
}