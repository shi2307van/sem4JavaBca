abstract class Vegetable
{
  String color;
  Vegetable(String c)
  {
    color = c;
  }
  abstract public String toString();
}
class Potato extends Vegetable
{
   Potato(String c)
  {
     super(c);
  }
  public String toString()
  {
    return "potato is "+color+"in color";
  } 
}
class Birnjal extends Vegetable
{
   Birnjal(String c)
  {
     super(c);
  }
  public String toString()
  {
    return "Birnjal is "+color+"in color";
  }
}
class Tomato extends Vegetable
{
   Tomato(String c)
  {
     super(c);
  }
  public String toString()
  {
    return "Tomato is "+color+"in color";
  }
}
class Vegetable_demo
{
  public static void main(String args[])
  {
    Potato p = new Potato("yellow");
    Birnjal b = new Birnjal("purple");
    Tomato t = new Tomato("red");
    
    System.out.println("Describing Potato = " + p);
    System.out.println("Describing Birnjal = " + b);
    System.out.println("Describing Tomato = " + t);
  }
}