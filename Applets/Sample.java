
import java.applet.*;
import java.awt.*;

/*<html><applet code=Sample width=500 height=500></applet> </html>*/

public class Sample extends Applet{
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
