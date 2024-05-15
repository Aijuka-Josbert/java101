import java.util.Scanner;

public class Scanner1 {
    String name;
    int age;

    //watsoever
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
     }
     public String getName(){
      return name;
    }
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);//initializing scanner

        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("my name is: " + name);
      
        System.out.print("Enter age:");
        int age = scan.nextInt();
        System.out.println("The age is: "+age);
    
}
}