import java.util.Scanner;

public class Ball3{
   //declaring variables
    String title;
    String name;
    int started;
    float salary;
    String position;
    String student;
    String regno;


//geting to be printed out
    public String getTitle(){
        return title;
    }
    public float getStarted(){
      return started;
    }
    public String getPosition(){
      return position;
    }
    public String getName(){
      return name;
    }

    //initializing the vriables into java
    public void setStudent(String student){
      this.student = student;
    }
    public void setRegno(String regno){
      this.regno = regno;
    }
 public void setTitle(String title){
    this.title = title;
 }
 public void setName(String name){
    this.name = name;
 }

 public String getStudent(){
   return student;
 }
 public String getRegno(){
   return regno;
 }
 public void setStarted(int started){
    this.started = started;
 }
 public void setSalary(float salary){
    this.salary = salary;
 }
 public float getSalary(){
   return salary;
 }

 public void setPosition(String position){
    this.position = position;
 }
    public static void main(String[] args) {
        Ball3 myDetails = new Ball3();
        System.out.println(myDetails.getTitle());
        Scanner scan = new Scanner(System.in);//initializing scanner
      while (true) {
        System.out.print("Enter Title: ");
        String title = scan.nextLine();
        System.out.println("The title is: "+ title);
        if (title.isEmpty()){
          break;
        }
      
try{
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("The coach name is: " + name);
} catch (Exception e){
  System.out.println("Invalid entry Try Again!");
}
        
try{
        System.out.print("Enter Year it started: ");
        int started = scan.nextInt();
        System.out.println("The team started in: "+ started);
} catch (Exception e){
    System.out.println("Invalid entry!,Please enter a number");
}

try{
        System.out.print("The earned Salary: ");
        float salary = scan.nextFloat();
        System.out.println("Players earns a minimum of: "+ salary);
}catch(Exception e){
        System.out.println("Enter the salary number please");
}finally{
    System.out.println("Done executing retry if failed😂");
}
}
 
      /*  myDetails.setTitle("My Football team");
        myDetails.setName("Uganda Cranes");
        myDetails.setStarted(1890);
        myDetails.setSalary(40000);
        myDetails.setPosition("all positions");
        myDetails.setStudent("Aijuka Josbert");
        myDetails.setRegno("2023-B071-20758");
 
        //print on compiler
         System.out.println(myDetails.getTitle());
        System.out.println(myDetails.getSalary());
        System.out.println("The player is " + myDetails.getName());
        System.out.println("The player is " + myDetails.getStarted()+ " years old.");
    */}
    
}
 
class Lakers{
  public String title;
  public int nop;
  private String manager;
  protected String contract;

  Lakers(String title,int nop,String manager,String contract){
    this.title =title;
    this.nop = nop;
    this.manager = manager;
    this.contract = contract;
  }
 
  public String getTitle(){
    return title;
  }
  public int getNop(){
    return nop;
  }
  private String getManager(){
    return manager;
  }
  protected String getContract(){
    return contract;
  }

  public static void main(String []args){
    Lakers lakers = new Lakers("Los Angeles lakers",16, "Arteta", "5years");

    System.out.println(lakers.getTitle());
  }
}