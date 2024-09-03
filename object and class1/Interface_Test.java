class Interface_Test{
  public static void main(String[] args){
    Reactangle r = new Reactangle();
    Triangle t = new Triangle();
    
    Area a;
    a = r;
    System.out.println("Area Of Reactangle :-" + a.compute(10.0,3.0));
    a = t;
    System.out.println("Area Of Triangle :-" + a.compute(10.0,3.0));
  }
}