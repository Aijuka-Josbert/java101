import java.util.Scanner;
public class Emma {
    String fname;
    String lname;
    int age;
    String skill;
    int height;
//getters and setters
   public String getFname() {
      return fname;
   }
   public void setFname(String fname) {
      this.fname = fname;
   }
   public String getLname() {
      return lname;
   }
   public void setLname(String lname) {
      this.lname = lname;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public String getSkill() {
      return skill;
   }
   public void setSkill(String skill) {
      this.skill = skill;
   }
   public int getHeight() {
      return height;
   }
   public void setHeight(int height) {
      this.height = height;
   }
//Main method
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   // personal details
   System.out.print("Enter your First name: ");
   String fname = scanner.nextLine();
   System.out.println("My first name is: "+ fname);
   if (fname.matches(".*\\d.*")){
      System.out.println("That's invalid");
      return;
    }

    System.out.print("Enter your Second name: ");
    String lname = scanner.nextLine();
    System.out.println("My last name is: "+ lname);
    if (lname.matches(".*\\d.*")){
       System.out.println("That's invalid");
       return;
     }

try{
   System.out.print("Enter your age: ");
   int age = scanner.nextInt();
   System.out.println("My age is: "+ age);
}catch (Exception e){
   System.out.println("Enter the rigt age please");
}
   System.out.print("Enter your skills: ");
   String skill = scanner.nextLine();
   System.out.println("Am skilled in: "+ skill);
   if (fname.matches(".*\\d.*")){
      System.out.println("That's invalid");
      return;
    }
   
try{
   System.out.print("Enter your height: ");
   int height = scanner.nextInt();
   System.out.println("My height is: "+ height);
}catch(Exception e){
   System.out.println("Please enter a digit");
}
finally{
   System.out.println("Thank you sir");
}

//instace of Job
Job mydetails = new Job("CEO",45000000,"Lubaga",60);
System.out.println(mydetails.toString());

}
}

class Job extends Emma {
    String title;
    int salary;
    String location;
    int numberofemployees;

    public Job(String title, int salary, String location, int numberofemployees){
        this.title = title;
        this.salary = salary;
        this.location = location;
        this.numberofemployees = numberofemployees;
    }

    public String toString() {
        return "\njob title: "+ title + "\nMy salary is: "+ salary + "\nBusiness location: "+ location + "\n Number of employees: "+
        numberofemployees;
    }
}
