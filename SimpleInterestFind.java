import java.util.*;

class SimpleInterestFind
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the value principal");
    double principal = sc.nextDouble();
    
    System.out.println("Enter the value rate");
    double rate = sc.nextDouble();
    
    System.out.println("Enter the value time");
    double time = sc.nextDouble();
    
    double simple = (principal * rate * time)/100;
    
    System.out.println("principal :" + principal);
    System.out.println("rate :" + rate);
    System.out.println("time :" + time);
    System.out.printf("simple Interest : %.3f" , simple);
  }
}