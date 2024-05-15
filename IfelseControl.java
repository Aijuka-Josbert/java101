import java.util.Scanner;
public class IfelseControl{
    public static void main(String []args){
            Scanner scanner = new Scanner(System.in);
           //int score = 90;
            System.out.println("Enter grades for students");
            int score =scanner.nextInt();
            if(score >= 90){
                System.out.println("Your grade is A");
            }
            else if(score >= 80){
                System.out.println("Your grade is B");
            }
            else if(score >= 70){
                System.out.println("Your grade is D");
            }
            else if(score < 60){
                System.out.println("you failed");
            }
    }
}
