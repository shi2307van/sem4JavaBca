import java.util.*;
class DemoRact
{
  public static void main(String[] args)
  {
    Rectangle rec = new Rectangle(5,10);
   double  peri = rec.getPeri();
   double area = rec.getArea();
     System.out.print("====== first object ======");
    System.out.printf(" \n Perimeter of Ractangle :- %f",peri);
    System.out.printf("\n  Area of Rectangle :- %f",area);
    1
    Scanner sc = new Scanner(System.in);
    float l,b;
       System.out.print(" \n ====== second object ====== \n ");
    System.out.println(" \n Enter the value L :-");
    l = sc.nextFloat();
    System.out.println("\n Enter the value B :-");
    b = sc.nextFloat();
    
   Rectangle rec2 = new Rectangle(l,b);
   double perimeter = rec2.getPeri();
   double areasec = rec2.getArea();
   System.out.printf(" \n Perimeter of Ractangle :- %f",perimeter);
   System.out.printf("\n  Area of Rectangle :- %f",areasec);
  }
}