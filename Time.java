import java.util.Scanner;
public class Time{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int time, hour, minute, second, remainingTime;
        System.out.print("Enter the time: ");

        time = input.nextInt();
        hour = time / 3600;
        remainingTime = time % 3600;
        minute = remainingTime / 60;
        second = remainingTime % 60;

        System.out.println("Hour: "+ hour);
        System.out.println("Minutes "+ minute);
        System.out.println("Second: "+second);
        }
}