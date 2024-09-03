public class ProductCheck{
  private static String name;
  private static int id,qty;
  private static float price;
  public ProductCheck(int id,String name,int qty,float price)
  {
    if(id<0){
      throw new IllegalArgumentException("ID is not Valid.. Try again");
    }
    if(name==null){
      throw new IllegalArgumentException("NAME is not Valid.. Try again");
    }
    if(qty<0){
      throw new IllegalArgumentException("Quantity is not Valid.. Try again");
    }
    if(price<0){
       throw new IllegalArgumentException("Price is not Valid.. Try again");
    }
    this.id = id;
    this.name = name;
    this.qty = qty;
    this.price = price;
  }
}