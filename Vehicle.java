public class Vehicle {
    String carName;
    String color;
//construtor
    public Vehicle(String carName, String color) {
        this.carName = carName;
        this.color = color;
    }
//setter and getterx
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method that returns color
    public String toString() {
        return "This vehicle is " + color;
    }
//main method
    public static void main(String[] args) {
        Vehicle myvehicle = new Vehicle("Maybach", "Black");

        System.out.println(myvehicle.toString());
    }
}
/* 
public Me extends Vehicle {
    String type;
    int passagers;

    public Me(String type, int passagers){
        this.type = type;
        this.passagers = passagers;
        this.carName = carName;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPassagers() {
        return passagers;
    }
    public void setPassagers(int passagers) {
        this.passagers = passagers;
    }
    
    public String toString(){
        return "the vehicle carries"+ passagers + color;

        public static void main(String []args){
            Me myme = new Me("lamborghini","1");

            System.out.println(myme.toString);
        }
    }
}*/