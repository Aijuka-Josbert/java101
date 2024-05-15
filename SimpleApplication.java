public class SimpleApplication {
    public static void main(String[] args) {
        Welcomer welcomer = new Welcomer();
        welcomer.sayHello();
    }
}

 class Welcomer{
    private String welcome = "Hello";

    public void sayHello() {
        System.out.println(welcome);
    }
}