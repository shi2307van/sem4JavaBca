class Student{
  private int rollno;
  private String name;
  private int sem;
  private char div;
  private String email;
  
  Student(int rollno,String name, int sem,char div,String email){
    this.rollno = rollno;
    this.name = name;
    this.sem = sem;
    this.div = div;
    this.email = email;
  }
  int getRollno(){
    return rollno;
  }
   String getName(){
    return name;
  }
    int getSem(){
    return sem;
  }
     char getDiv(){
    return div;
  }
     String getEmail(){
    return email;
  }
    void setRollno(int rollno){
       this.rollno = rollno;
  }
    void setName(String name){
       this.name = name;
  }
    void setSem(int sem){
       this.sem = sem;
  }
    void setDiv(char div){
       this.div = div;
  }
    void setEmail(String email){
       this.email = email;
  }
    public String toString(){
      return String.format("\n %4d %20s %20d %20c %25s",rollno,name,sem,div,email);
    }
}