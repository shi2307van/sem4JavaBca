class OneD_Demo
{
  public static void main(String[] args)
  {
    String subs[] = {"Is","Web Designing","vb.net","se-11","java","python","os"};
    
    System.out.print("\n=====All Subject Of BCA====\n");
    
    for(int i=0;i<subs.length;i++)
      System.out.println((i+1)+"\t" + subs[i]);
    
    int m[] = new int[6];
    
    int k=10;
    
    for(int i=0;i<m.length;i++)
      m[i]=k++;
    
    for(int i=0;i<m.length;i++)
       System.out.println("m ["+i+"] = " + m[i]);
  }
}