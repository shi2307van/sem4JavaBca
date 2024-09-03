/*<applet code=Draw_React height=400 width=400></applet>*/
import java.applet.*;
import java.awt.*;

public class Draw_React extends Applet
{
  public void paint(Graphics g)
  {
    g.setColor(Color.darkGray);
    g.drawRect(10,10,120,70);
    g.fillRect(10,10,120,70);
    g.setColor(Color.red);
    g.drawRect(100,100,100,100);
    g.fillRect(100,100,100,100);
  }
}