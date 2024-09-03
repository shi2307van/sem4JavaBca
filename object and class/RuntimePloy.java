class RuntimePloy{
  public static void main(String[] args){
   
    Shape s;
    s = new Reactangle(7,8);
    System.out.println("Area of Ractangle : " + s.getArea());
    s  = new Triangle(20,10);
   System.out.println("Area of Triangle : " + s.getArea());
      
  }
}