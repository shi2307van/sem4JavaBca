import java.util.*;

class circle
{
  public static void main(String[] ars)
  {
    Scanner sc = new Scanner(System.in);
   
    int radius;
    double circumference,area,diameter;
   
      do{
      System.out.print("enter value of radius :");
      radius = sc.nextInt();
     
      if(radius < 0)
        System.out.println("\n please enter correct number ");
    }while(radius < 0);
     
      diameter = 2 * radius;
           System.out.printf("diameter of circle ==> %f\n",diameter);
      circumference = 2 * 3.14 * radius;
           System.out.printf("circumference of circle ==> %f\n",circumference);
      area = 3.14 * radius * radius;
          System.out.printf("area of circle ==> %f\n",area);
  }
}
