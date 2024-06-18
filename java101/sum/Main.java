class Animal{
    String sound;
    public Animal(String sound){
        this.sound = sound;
    }
    public void makeSound(){
        System.out.println(sound);
    }
}
class Dog extends Animal{
    public Dog(){
        super("woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
    
}