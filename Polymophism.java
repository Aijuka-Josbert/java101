class Add{
   int add(int x, int y){
    return x+y;
   }
   double add(double x, double y){
    return x+y;
   }
   int add(int x, int y, int z){
    return x+y+z;
   } 
     //System.out.println("Thats the total value ");
}
public class Polymophism{
    //int x, y, z;
    public static void main(String []args){
        Add a = new Add();
        //print
        System.out.println("the tota is: "+ a.add(3,4));
        System.out.println("double is: "+ a.add(8.4,8.3));
        System.out.println("Also this: "+ a.add(2,3,8));
    }
}