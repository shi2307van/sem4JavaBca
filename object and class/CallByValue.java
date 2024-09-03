class CallByValue{
  public static void main(String[] args)
  {
    int a = 3;
    System.out.println("Value Of A before Calling math() is " + a);
    math(a);
    System.out.println("Value Of a After Calling math() is " +a);
  }
  public static void math(int num){
    System.out.println("Value Of num Before incrementing is "+num);
    num++;
     System.out.println("Value Of num After incrementing is "+num);
  }
}