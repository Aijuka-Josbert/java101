import java.util.Scanner;
// using inheritance method from main class Ball3 to  Team(the child class creating a relationship)
public class Team extends Ball3 {
   // Declare class variables
    String coach;
    String playernames;
    String field;
    int teamno;
    int attendance;
    String fanpage;
    double profits;

  // Define setter methods for each class variable
 public void setCoach(String coach){
    this.coach = coach; // Set the coach variable to the provided value
 }
 public void setPlayernames(String playernames){
    this.playernames = playernames;
 }
 public void setField(String field){
    this.field = field; 
 }
 public void setTeamno(int teamno){
    this.teamno = teamno;
 }
 public void setAttendance(int attendance){
    this.attendance = attendance;
 }
 public void setFanpage(String fanpage){
    this.fanpage =fanpage;
 }
 public void setProfits(double profits){
    this.profits = profits; 
 }
 
 // Define getter methods for each class variable
 public String getcoach(){
    return coach;// Return the value of the coach variable
 }
 public double getprofit(){
   return profits;
 }
 public String getFeild(){
   return field;
 }
 
  // Define the main method to create an instance of the Team class and set its properties
 public static void main(String[] args) {
  //  Team TeamDetails = new Team(); // Declare a variable of type Team
    Scanner scanbio = new Scanner(System.in);

    //scanner is the dynamic method
    System.out.print("Enter Names of the coach: ");
    String coach = scanbio.nextLine();
    System.out.println("The name of the coach is: "+ coach);  

    System.out.print("Enter Name of the Field:");
    String field = scanbio.nextLine();
    System.out.println("Pitch name is: "+ field);
try{
    System.out.print("The number of players in the team: ");
    int teamno = scanbio.nextInt();
    System.out.println("Its: "+ teamno+ " players.");
}catch(Exception e){
   System.out.println("Please Enter the an interger of number of players");
}
try{
    System.out.print("What Amounts of profits do you earn yearly: ");
    double profits = scanbio.nextDouble();
    System.out.println("We earn over: "+  profits +" yearly");
} catch(Exception e){
   System.out.println("Enter an Amount of proifits not words");
}
try{
    System.out.print("Write your Registration Numbers: ");
    String regno = scanbio.nextLine();
    System.out.println("Regno is: "+ regno );
} catch(Exception e){
   System.out.println("Enter ur right Reg no.");
}



  // Set the properties of the TeamDetails object forced/static method
   /* TeamDetails.setCoach("Mikel Jonah");
    TeamDetails.setPlayernames("Nicholas Johaims");
    TeamDetails.setField("Namboole stadium");
    TeamDetails.setTeamno(30);
    TeamDetails.setAttendance(30000);
    TeamDetails.setFanpage("twitter page");
    TeamDetails.setProfits(10000000);
    TeamDetails.setTitle("My Football team");
    TeamDetails.setSalary("$40000");
    TeamDetails.setPosition("National league tournaments");
    TeamDetails.setStudent("Aijuka Josbert");
    TeamDetails.setRegno("2023-B071-20758");
    TeamDetails.setName("Uganda Cranes");
    
    // Print out the values of the coach and TeamDetails properties
  System.out.println("I am"+" "+TeamDetails.getStudent()+ " "+ "Registration no."+ " "+TeamDetails.getRegno());
  System.out.println("The team is called"+" "+TeamDetails.getName()+" "+"Coached by"+" "+TeamDetails.getcoach());
  System.out.println("my team players play" + " " + TeamDetails.getPosition()+" "+"in the league");
  System.out.println("The Team home pitch is called:"+" "+TeamDetails.getFeild());*/

   }
 }