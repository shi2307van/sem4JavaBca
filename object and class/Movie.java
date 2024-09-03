import java.util.*;

class Movie{
  String title;
  String actor;
  String actress;
  String category;
  int releaseYear;
  void getData(){
    Scanner sc = new Scanner(System.in);
    System.out.println("What's The Movie Title :-");
    title = sc.nextLine().toUpperCase();
    System.out.println("Who is/are Actor(s):-");
    actor = sc.nextLine().toUpperCase();
    System.out.println("Who is/are Actress(s):-");
    actress = sc.nextLine().toUpperCase();
    System.out.println("What Type Of Movie It Is :-");
    category = sc.nextLine().toUpperCase();
    System.out.println("In Which Year It Was Released :-");
    releaseYear = Integer.parseInt(sc.nextLine());
  }
  public String toString(){
    return String.format("\n %-30s %-20s %-20s %-20s %5d",title,actor,actress,category,releaseYear);
  }
}