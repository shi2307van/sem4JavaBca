class Cricketer implements Runnable{
  Thread t;
  String name[];
  int score[];
  Cricketer(String name[],int score[]){
    this.name = name;
    this.score = score;
    t = new Thread(this);
    t.start();
  }
  void sortScore(){
    int i,tmpage,j;
    String tmpname;
    for(i=0;i<9;i++){
      for(j=i+1;j<10;j++){
        if(score[i]<score[j]){
          tmpage = score[i];
          score[i] = score[j];
          score[j] = tmpage;
          
          tmpname = name[i];
          name[i] = name[j];
          name[j] = tmpname;
        }
      }
    }
  }
  public void run(){
    sortScore();
    try{
      for(int i=0;i<10;i++){
        System.out.println(name[i] + " = " + score[i]);
        Thread.sleep(2000);
      }
    } 
    catch(Exception e){
      System.out.println("Main Thread Inturrupted" + e);
    }
  }
}