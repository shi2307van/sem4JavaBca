import java.util.*;
class ArrayObjectDemo{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("How Many Movies You Would Like To Enter :-");
    n = sc.nextInt();
    
    Movie mov[] = new Movie[n];
    for(int i=0;i<n;i++){
      mov[i] = new Movie();
      mov[i].getData();
    }
    System.out.println("==============================================Movie's List=====================================================");
    System.out.printf("%-30s %-20s %-20s %-20s %10s","Title","Actor","Actress","Category","Release Year");
    
    for(Movie m : mov)
      System.out.println(m);
  }
}