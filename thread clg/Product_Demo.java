import java.util.*;
class Product_Demo{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int n;
    System.out.println("How Many Product Details You Want :-");
    n = sc.nextInt();
    String name[] = new String[n];
    int price[] = new int[n];
    int qty[] = new int[n];
    for(int i=0;i<n;i++){
      System.out.println("Product Name :-");
      name[i] = sc.next().toUpperCase();
      System.out.println("Product Price :-" + name[i]);
      price[i] = sc.nextInt();
      System.out.println("Product Qty :-" + name[i]);
      qty[i] = sc.nextInt();
    }
  Product cobj = new Product(name,price,qty);
    try{
   cobj.t.join();
    }
   catch(Exception e){
      System.out.println("OOps Error");
   }
  }
}
