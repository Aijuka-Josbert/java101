class Animal{
    /*String*/ void sound(){
        System.out.println("Animal makes sound");
    }
} 

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
        }
}
public class Polymophism1 {
    public static void main(String []args){
        Animal a = new Animal();
        a.sound();
        Animal b = new Dog();
        b.sound();
        Animal c = new Cat();
        c.sound();
    }
}
