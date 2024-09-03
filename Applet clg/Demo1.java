import java.awt.*;
import java.applet.*;

/*<applet code="Demo1" height=200 width=400>
  <param name="sname" value="shivani">
  </applet>*/

public class Demo1 extends Applet{
  Font f;
  public void init(){
    f = new Font ("Arial",Font.BOLD,30);
   
    setFont(f);
  }
  public void paint(Graphics g){
    String name = getParameter("sname"); 
      g.setColor(Color.red);
    g.drawString(name,100,100);
   
  }
}