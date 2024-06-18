/*class Add{
    int sum = 0;
    public int addTwo(int a, int b){
        sum = a + b;
        return sum;
    }
}
    public class Sum3{
        public static void main(String []args){
            Add add = new Add();
            int z = add.addTwo(5,7);
            System.out.println(z);
        }
    }*/
//or
public class Sum3{
    public static void main(String []args){
        int x= 5;
        int y = 8;

        int z = add(x,y);
        System.out.println(z);

    }
    static int add(int x,int y){
        int z = x + y;
        return z;
    }
}