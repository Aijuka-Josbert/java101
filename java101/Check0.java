//import java.util.Scanner;
public class Check0{
      /*  Scanner  scn = new Scanner(System.in);  
       //int count=6;
       //int count;
       int count = scn.nextInt();
       if(count % 2==0){
       // System.out.println("The number is even");
       System.out.println("what is hapening");
       
       System.out.println("this number is even " + count);
    } else{
                System.out.println("the number is odd");
            }
        */
            public static void main(String[] args) {
                int x = 8;
                boolean isEven = checkeven(x);
                System.out.println(isEven);
            }
        
            public static boolean checkeven(int x) {
                if (x % 2 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }