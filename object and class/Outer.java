class Outer{
  int x = 100;
  class Inner{
    void display(){
      System.out.println("display x = " + x);
    }
  }
  void test(){
    Inner in = new Inner();
    in.display();
  }
}