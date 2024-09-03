import java.io.*;
class AgeCheckDemo{
  public static void main(String args[]) throws IOException{
  int age;
  DataInputStream in = new DataInputStream(System.in);
  age = Integer.parseInt(in.readLine());
  try{
    if(age<15||age>60)
      throw new Agecheck(age);
    else 
      System.out.println("You are"+age+"Years old.");
  }
  catch(Agecheck e){
    System.out.println("Exception:"+e);
  }
  }
}