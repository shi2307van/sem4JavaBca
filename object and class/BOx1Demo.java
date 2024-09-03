class BOx1Demo
{
  public static void main(String[] args)
  {
    Box1 b1 = new Box1();
    double vol;
    vol = b1.volume();
    System.out.println("Volume Of b1 :-" +" "+ vol);
    
    Box1 b2 = new Box1(5);
    vol = b2.volume();
    System.out.println("Volume Of b2 :-" + " " +vol);
    
     Box1 b3 = new Box1(5,6,7);
    vol = b3.volume();
    System.out.println("Volume Of b3 :-" +" "+ vol);
    
     Box1 b4 = new Box1(b3);
    vol = b4.volume();
    System.out.println("Volume Of b4 :-" +" "+ vol);
    
     Box1 b5 = new Box1(5.8);
    vol = b5.volume();
    System.out.println("Volume Of b5 :-" +" "+ vol);
  }
}