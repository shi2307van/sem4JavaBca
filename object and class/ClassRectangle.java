class ClassRectangle
{
  float l,b;
  ClassRectangle(float l,float b){
    this.l = l;
    this.b = b; 
  }
  double getPerimeter(){
    return 2*(l +b );
  }
  double getArea(){
    return l*b ;
  }
}
