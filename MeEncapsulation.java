import java.util.Scanner;
class Encapsulation{
    private String lname;
    private String fname;
    private String occupation;
    private int age;

    public void setLname(String lname){this.lname = lname;}
    public String getLname(){return lname;}

    public void setFname(String fname){this.fname = fname;}
    public String getFname(){return fname;}

    public void setOccupation(String occupation){this.occupation = occupation;}
    public String getOccupation(){return occupation;}

    public void setAge(int age){this.age = age;}
    public int getAge(){return age;}


}
public class MeEncapsulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What are you name: ");
        String lname = scan.nextLine();
        System.out.println("My names are: "+ lname);

        System.out.print("What are you name: ");
        String fname = scan.nextLine();
        System.out.println("My names are: "+fname);

        System.out.print("What are your occupation: ");
        String occupation = scan.nextLine();
        System.out.println("My occupation is:  "+ occupation);

        System.out.print("write ur age ");
        int age  = scan.nextInt();
        System.out.println("My names are: "+ age);
       // Encapsulation object = new Encapsulation();

       /*  object.setLname("Kirungi");
        object.setFname("Pamela");
        object.setOccupation("Student");
        object.setAge(19);

        System.out.println("My name is: "+ object.getLname() +" "+ object.getFname() +" "+ "And am a "+" "+ object.getOccupation() + "Aged: "+ object.getAge());
    */
    }
}
