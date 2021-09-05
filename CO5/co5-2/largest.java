import java.awt.*;
import java.applet.*;
import java.io.*;

/*
<applet code="largest" width=600 height=600>
<param name="a" value="100">
<param name="b" value="70">
<param name="c" value="17">
</applet>
*/

public class largest extends Applet
{
public void init()
{
setBackground(Color.YELLOW);
}
	int a;
	int b;
	int c;
        int d;
	String str;

	public void start()
	{
		String s1;

		s1 = getParameter("a");
		a = Integer.parseInt(s1);

		s1 = getParameter("b");
		b = Integer.parseInt(s1);
                
                s1 = getParameter("c");
		c = Integer.parseInt(s1);
	}

	public void paint(Graphics g)
	{
		if( a >= b && a >= c)
			d = a;
		else if (b >= a && b >= c)
                        d=b;
                else
                       d=c;
                g.drawString("First Number:   " + a, 100, 50);
		g.drawString("Second Number:   " + b, 100, 100);
                g.drawString("Third Number:   " + c, 100, 150);
		g.drawString("Maximum of Three Numbers :  " + d, 100, 200);
	}
}