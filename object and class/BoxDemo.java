class BoxDemo
{
  public static void main(String[] args)
  {
    box b1 = new box();
    b1.width = 5;
    b1.height= 5;
    b1.depth = 5;
    double vol = b1.volume();
    System.out.println("Volume Of Box b1 :-" + vol );
  }
}