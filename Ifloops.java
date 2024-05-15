import java.util.Scanner;
public class Ifloops{
    public static void main(String []args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("enter values below");
    int score = scanner.nextInt();
    
    if (score < 50) {
        System.out.println("nyoko u failed");
        System.out.println("Try again next year");
    }
    else{
        System.out.println("wow u passed");
    }
}
}