import java.util.Scanner;

public class Stupid{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        while(true){
        System.out.print("what are your name: ");
        String name = scan.nextLine();
        System.out.println("Type here: "+ name);
            if(name.isEmpty()){
                break;
            }
    

        System.out.print("Describe your profession: ");
        String skill = scan.nextLine();
        System.out.println("My skills are: "+ skill);
        if (skill.matches(".*\\d.*")){
          System.out.println("That's invalid");
          return;
        }

        try{
            System.out.print("Enter the age: ");
            int age = scan.nextInt();
            System.out.println("My age: ");
        }catch(Exception e){
            System.out.println("Please use numbers here ");
        }
    }
 
    Person bridget = new Person();
        String name;
        int age;
        String gender;

        bridget.setName("Birungi Bridegt");
        bridget.setAge(15);
        bridget.setGender("F");

        System.out.println("Bridget's Name is: " + bridget.getName());
        System.out.println("Bridget's age is: " + bridget.getAge());
        System.out.println("Bridget's gender is: " + bridget.getGender());
    


    }

}