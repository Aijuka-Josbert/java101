import java.util.Scanner;
public class Calculator{

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);//object cretion

        System.out.println("WELCOME!");

        //number one 
        System.out.println("Enter the first number: ");
        double number1 = scan.nextDouble();
        scan.nextLine();

        //second number
        System.out.println("Enter the second number: ");
        double number2 = scan.nextDouble();
        scan.nextLine();

        //opertion declrtion
        System.out.println("What operation do you want to perfom: ");
        String operation = scan.nextLine();
        
        switch (operation) {
            case "sum":
            System.out.printf("the sum is: %f + %f = %f",number1,number2,number1 + number2);
                break;
            case "sub":
            System.out.printf("%f - %f = %f",number1,number2,number1 - number2);
                break;
            case "multi":
                System.out.printf("%f * %f = %f",number1,number2,number1 * number2);
                    break;
           case "div":
           if (number2 ==0) {
            System.out.println("Cannot divide number by zero ");
           }else{
                System.out.printf("%f / %f = %f",number1,number2,number1 / number2);
           }
           break;
            default:
            System.out.printf("%s is not a supported operation. ", operation);
                break;
        }

        scan.close();
    }
}