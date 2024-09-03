import java.util.*;

class RightAngleTriangle
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    double width,height,area,peri,hyp;
    
    do
    {
      System.out.println("Enter the Value of Height : ");
      height = in.nextDouble();
      
      System.out.println("Enter the value of Width : ");
      width = in.nextDouble();
       
      if(height < 0 || width < 0)
        System.out.println("Please the enter correct value !! ");
        
    }while(height < 0 || width < 0);
    
    area = 0.5 * width * height;
    hyp = Math.sqrt((width*width)+(height*height));
    peri = height + width + hyp ;
    
    System.out.printf(" area of right angle triangle ==> %.2f\n",area);
    System.out.printf(" hypotenuse of right angle triangle ==> %.2f\n",hyp);
    System.out.printf(" primeter of right angle triangle ==> %.2f\n",peri);
  }
}