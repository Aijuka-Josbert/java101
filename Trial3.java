import java.util.Scanner;

public class Trial3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Trial3 t = new Trial3();
    }
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        try {
            System.out.print("Enter age: ");
            age = scan.nextInt();
            if (age < 0 || age > 125)
                throw new Exception("Invalid Age");
        } catch (Exception e) {
            System.out.println("Nyonya bano");
        }
    }

    
}