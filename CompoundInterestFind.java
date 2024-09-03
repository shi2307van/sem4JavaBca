import java.util.*;
class CompoundInterestFind
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
    
    System.out.print("Enter number of times interest is compounded: ");
    int number = sc.nextInt();
    
    double compound = principal * (Math.pow((1 + rate/100), (time * number))) - principal;
    
  
    
    System.out.println("principal :" + principal);
    System.out.println("rate :" + rate);
    System.out.println("time :" + time);
    System.out.println("Number of Time interest Compounded: " + number);
    System.out.printf("compound Interest : %.3f" ,compound);
  }
}