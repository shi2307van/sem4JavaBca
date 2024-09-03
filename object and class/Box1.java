class Box1
{
  double width,height,depth;
  Box1()
  {
    width = 10;
    height = 10;
    depth = 10;
  }
  Box1(double width,double height,double depth)
  {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }
  Box1(Box1 ob)
  {
    width= ob.width;
    height= ob.height;
    depth= ob.depth;
  }
   Box1(double w)
  {
     this(w,6.0,5.0);
  }
    Box1(float len)
  {
     width = height = depth = len;
  }
    double volume()
    {
      return depth*height*width;
    }
}