class Triangle extends Shape{
  Triangle(double d1,double d2){
    super(d1,d2);
  }
   double getArea(){
    return 0.5*d1*d2;
  }
}