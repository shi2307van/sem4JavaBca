/*<applet code=Draw_line height=300 width=300></applet>*/
  
import java.applet.*;
import java.awt.*;

public class Draw_line extends Applet
{
  public void paint(Graphics g){
    g.setColor(Color.magenta);
    g.drawLine(0,0,100,100);
    g.setColor(Color.green);
    g.drawLine(20,20,200,20);
    g.setColor(Color.red);
    g.drawLine(30,30,30,200);
    g.setColor(Color.black);
    g.drawLine(180,100,50,180);
    g.drawLine(50,180,310,180);
    g.drawLine(180,100,310,180);
  }
}