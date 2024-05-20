class Shape{
    void shape(){
    System.out.println("This is a circle");
}
}
class Tringle extends Shape{
    void shape(){
        System.out.println("This is a tringle");
        }
}
class Octagon extends Shape{
    void shape(){
        System.out.println("this is an octagon");
    }
}
public class Circle{
public static void main(String []args){
    Shape s1 = new Shape();
    s1.shape();
    Shape s2 = new Tringle();
    s2.shape();
    Shape s3 = new Octagon();
    s3.shape ();
}
}