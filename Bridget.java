import java.util.Scanner;
public class Bridget {
    String fname;
    String lname;
    int age;
    int salary;
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
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is first name: ");
        String fname = scanner.nextLine();
        System.out.println("My first name is: "+ fname);
        if (fname.matches(".*\\d.*")){
            System.out.println("That's invalid");
            return;
          }
        System.out.println("What is your Second name: ");
        String lname = scanner.nextLine();
        System.out.println("My second name is: "+ lname);
        if (lname.matches(".*\\d.*")){
            System.out.println("That's invalid");
            return;
          }
    try{
        System.out.print("whats your age: ");
        int age = scanner.nextInt();
        System.out.println("The age: "+ age);
    }catch(Exception e){
        System.out.println("Invalid entry");
    }
    try{
        System.out.print("whats your salary: ");
        int salary = scanner.nextInt();
        System.out.println("The age: "+ salary);
    }catch(Exception e){
        System.out.println("Invalid entry");
    }
    finally{
        System.out.println("thanks u");
    }

}
}
