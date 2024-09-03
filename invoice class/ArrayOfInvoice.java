import java.util.*;
class ArrayOfInvoice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,proid ,qty;
    float price;
    String name;
    System.out.println("\n How Many Products You Want to Buy :-");
    n = sc.nextInt();
    Invoice iv[] = new Invoice[n];
    for(int i=0;i<n;i++){
      System.out.printf("\n Enter the Properties Of Paticular Product %d :-",i+1);
      System.out.println("\n Enter the Product ID :-");
      proid = sc.nextInt();
      System.out.println("\n Enter the Product Name :-");
      name = sc.next();
      System.out.println("\n Enter the Product Quantity :-");
      qty = sc.nextInt();
      System.out.println("\n Enter the Product Price :-");
      price = sc.nextFloat();
      iv[i] = new Invoice(proid,name,qty,price);
      ProductCheck p = new ProductCheck(proid,name,qty,price);
    }
    double sum=0;
    System.out.println("\n ======================Display All The Product In Proper Format=====================================\n");
    System.out.printf("\n %4s %20s %20s %20s %25s","Product id","Product Name","Product Quantity","Product Price","Product Total");
     System.out.println("\n ==================================================================================================\n");
    for(int i=0;i<n;i++){
    sum = sum + iv[i].getPaymentAmount();
    System.out.print(iv[i]);
    }
    System.out.print("\n ************************\n ");
    System.out.print("\n Grand Total :-");
    System.out.print(sum);
     System.out.print("\n ************************\n ");
  }
}
