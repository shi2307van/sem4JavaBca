class Rectangle
{
  float l,b;
  Rectangle(float l,float b)
  {
    this.l = l;
    this.b = b;
  }
  double getPeri(){
    return 2*(l+b);
  }
   double getArea(){
    return l*b;
  }
}
