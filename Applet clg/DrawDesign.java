/*<applet code="DrawDesign" width=1300 height=1000> </applet>*/

import java.awt.*;
import java.applet.*;

public class DrawDesign extends Applet 
{
  public void paint(Graphics g)
  {
    spiral(g);
    hut(g);
    smily(g);
    polygon(g);
    traffic(g);
    fan(g);
  }
  public void spiral(Graphics g){
    int x=10,y=10,w=450,h=450;
    Color c[] = {Color.blue,Color.red,Color.yellow,Color.white,Color.black,Color.cyan,Color.pink};
    for(int i=0; i<=6 ;i++)
    {
      g.setColor(c[i]);
      g.fillOval(x,y,h,w);
      x+=20;
      y+=20;
      w-=40;
      h-=40;
    }
  }
  public void hut(Graphics g){
    int s[] = {680,480,880};
    int t[] = {10,150,150};
    g.drawPolygon(s,t,s.length);
    g.setColor(Color.red);
    g.fillPolygon(s,t,s.length);
    g.drawRect(480,150,400,300);
    g.setColor(Color.green);
    g.fillRect(480,150,400,300);
    g.drawRoundRect(600,250,170,200,30,30);
    g.setColor(Color.black);
    g.fillRoundRect(600,250,170,200,30,30);
  }
  public void smily(Graphics g){
    g.setColor(Color.yellow);
    g.drawOval(930,20,450,450);
    g.fillOval(930,20,450,450);
    g.setColor(Color.black);
    g.drawOval(1040,120,80,80);
    g.fillOval(1040,120,80,80);
    g.drawOval(1200,120,80,80);
    g.fillOval(1200,120,80,80);
    g.setColor(Color.red);
    g.drawArc(1020,120,280,280,0,-180);
    g.fillArc(1020,120,280,280,0,-180);
  }
  public void polygon(Graphics g){
    g.setColor(Color.pink);
    g.drawRect(10,530,430,450);
    g.fillRect(10,530,430,450);
    g.setColor(Color.blue);
    g.drawOval(10,530,430,450);
    g.fillOval(10,530,430,450);
    int x[] = {10,225,430,225};
    int y[] = {760,530,760,980};
    g.setColor(Color.white);
    g.drawPolygon(x,y,4);
    g.fillPolygon(x,y,4);
   // g.drawString("TMTBCA",10,530);
  }
  public void traffic(Graphics g){
    g.setColor(Color.red);
    g.drawRect(500,500,300,400);
    g.drawRect(600,900,100,100);
    g.fillRect(600,900,100,100);
    g.setColor(Color.black);
    g.fillRect(500,500,300,400);
    g.setColor(Color.red);
    g.drawOval(600,530,90,90);
    g.fillOval(600,530,90,90);
    g.setColor(Color.orange);
    g.drawLine(700,580,850,580);
    g.setColor(Color.yellow);
    g.drawOval(600,650,90,90);
    g.fillOval(600,650,90,90);
    g.setColor(Color.orange);
    g.drawLine(700,700,850,700);
    g.setColor(Color.green);
    g.drawOval(600,780,90,90);
    g.fillOval(600,780,90,90);
    g.setColor(Color.orange);
    g.drawLine(700,830,850,830);
  }
  public void fan(Graphics g){
    int x[] = {1000,1250,1000,1250};
    int y[] = {500,500,950,950};
    g.setColor(Color.);
    g.drawPolygon(x,y,4);
  }
}