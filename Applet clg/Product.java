class Product implements Runnable
{
  Thread t;
  String nm[];
  int price[];
  int qty[];
  Product(String nm[],int price[],int qty[])
  {
    this.nm=nm;
    this.price=price;
    this.qty=qty;
    t = new Thread(this);
    t.start();
  }
  void SortProduct()
  {
    int temp ,temp1;
    String temp2;
    for(int i=0;i<nm.length;i++)
    {
      for(int j=i+1;j<nm.length;j++)
      {
        if(qty[i]>qty[j])
        {
          temp=qty[i];
          qty[i]=qty[j];
          qty[j]=temp;
          
          temp2=nm[i];
          nm[i]=nm[j];
          nm[j]=temp2;
          
          temp1 = price[i];
          price[i] = price[j];
          price[j] = temp1;
        }
      }
    }
  }
  public void run(){
    SortProduct();
    try{
     
      for(int i=0;i<nm.length;i++){
        System.out.printf(" \n %5s  %5s  %5s","Product Name","Product Price","Product Qty \n");
        System.out.printf("%10s  %10d  %10d ",nm[i], price[i] ,qty[i]);
        Thread.sleep(2000);
      }
    } 
     catch(Exception e){
      System.out.println("Main Thread Inturrupted" + e);
    }
  }
}