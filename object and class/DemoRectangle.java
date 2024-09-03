class DemoRectangle
{
  public static void main(String[] args)
  {
    ClassRectangle rec = new ClassRectangle(5,10);
    double area,peri;
    
    peri = rec.getPerimeter();
    area = rec.getArea();
    
    System.out.printf("\n perimeter of Rectangle is :- %.2f",peri);
    System.out.printf("\n area of Rectangle is :- %.2f",area);
  }
}
