class Agecheck extends Exception{
  int age;
  Agecheck(int age){
    this.age = age;
  }
  public String toString(){
    return "Valid Age is Between 15 And 60 .You Have entered"+age+".";
   
  }
}