import java.util.*;

class Rectangle
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
   
    int l,w;
    double peri,area;
   
    do{
     
      System.out.print("enter the value of length -> ");
          l = sc.nextInt();
      System.out.println("\n enter the value of width -> ");
           w = sc.nextInt();
       if(l<0 || w<0)
         System.out.println("please enter correct number ");
    }while(l<0 || w<0);
   
   
    peri = 2 * (l + w);
      System.out.printf(" perimeter of rectangle--> %f\n",peri);
    area = w * l;
      System.out.printf("area of rectangle ---> %f",area);
   
  }
}
