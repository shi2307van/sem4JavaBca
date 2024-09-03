class InnerClassDemo{
  public static void main(String[] args){
    Outer Outer = new Outer();
    Outer.test();
    Outer.Inner out = Outer.new Inner();
    out.display();
  }
}