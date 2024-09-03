import java.util.*;

class SplitSpace
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String obs = new String();
    System.out.print("Enter one sentence of your choice :-");
    obs = sc.nextLine();
     
    String[] sent = obs.split(" ");
    for(String s : sent){
    System.out.println(s);
    }
  }
}