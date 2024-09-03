import java.util.*;
class Cricketer_Demo{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    String name[] = new String[10];
    int score[] = new int[10];
    for(int i=0;i<10;i++){
      System.out.println("Cricketer Name :-");
      name[i] = sc.next().toUpperCase();
      System.out.println("Cricketer Score :-" + name[i]);
      score[i] = sc.nextInt();
    }
    Cricketer cobj = new Cricketer(name,score);
    try{
      cobj.t.join();
    }
    catch(Exception e){
      System.out.println("OOps Error");
    }
  }
}
