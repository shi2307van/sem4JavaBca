/*<applet code=Draw_RoundReact height=700 width=700></applet>*/
import java.applet.*;
import java.awt.*;

public class Draw_RoundReact extends Applet
{
  public void paint(Graphics g)
  {
    g.setColor(Color.cyan);
    g.drawRoundRect(10,10,120,70,10,40);
    g.fillRoundRect(10,10,120,70,10,40);
    g.setColor(Color.black);
    g.drawRoundRect(100,100,100,100,10,40);
    g.fillRoundRect(100,100,100,100,10,40);
  }
}