import java.util.*;

class AverageTemp
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    float sum = 0;
    String obs = new String();
    System.out.print("Enter Temperature of December Month Separated By Comma e.g (2.2,23.4,34.4)");
    obs = sc.nextLine();
    String temp[] = obs.split(",");
    float decTem[] = new float [temp.length];
    for(int i=0;i<temp.length;i++)
    {
      decTem[i] = Float.parseFloat(temp[i]);
    }
     for(int i=0;i<temp.length;i++)
    {
      sum = sum + decTem[i];
    }
     System.out.printf("so,the average temperature of the december month was %.2f ",sum/decTem.length);
  }
}