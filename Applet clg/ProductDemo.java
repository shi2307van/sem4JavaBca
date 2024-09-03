import java.util.*;
class ProductDemo
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("How Many Product of you Want:");
    int n = sc.nextInt();
    String name[]=new String[n];
    int price[]=new int[n];
    int qty[]= new int[n];
    
    for(int i=0;i<n;i++)
    {
      System.out.println("Product of the Name:");
      name[i]= sc.next().toUpperCase();
      System.out.println("Product of the Price:");
      price[i]= sc.nextInt();
      System.out.println("Product of the Qty:");
      qty[i]= sc.nextInt();
    }
    
    Product Pobj = new Product(name,price,qty);
    try
    {
      Pobj.t.join();
    }catch(Exception e)
    {
      System.out.println("oop error.."+e);
    }
  }
}