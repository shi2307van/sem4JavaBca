import java.applet.*;
import java.awt.*;

/*<HTML><applet code=Draw width=500 height=500></applet></HTML>*/

public class Draw extends Applet{
  Font f;
  public void init(){
    f = new Font("Courier",Font.BOLD,16);
    setFont(f);
    setBackground(Color.cyan);
    setForeground(Color.red);
  }
  public void paint(Graphics g){
    g.drawString("shivanishinde",100,100);
  }
 
}