public class Driver {
    public static void main(String[] args) {
        Person tim = new Person();
        tim.setFullname("Timothy Walusimbi");
        tim.setAge(35);
        tim.setSalary(1500000);
        tim.setGender('m');
        System.out.println("Tim's Name is: " + tim.getFullname());
        System.out.println("Tim's age is: " + tim.getAge());
        System.out.println("Tim's gender is: " + tim.getGender());
        System.out.println("Tim's salary is: " + tim.getSalary());

        Person alex = new Person();
        alex.setFullname("Alex Mulondo");
        alex.setAge(40);
        alex.setSalary(4500000);
        alex.setGender('m');
        System.out.println();
        System.out.println("Alex's Name is: " + alex.getFullname());
        System.out.println("Alex's age is: " + alex.getAge());
        System.out.println("Alex's gender is: " + alex.getGender());
        System.out.println("Alex's salary is: " + alex.getSalary());

        Person alice = new Person();
        alice.setFullname("Alice Nambi");
        alice.setAge(15);
        alice.setSalary(6500000);
        alice.setGender('F');
        System.out.println();
        System.out.println("Alice's Name is: " + alice.getFullname());
        System.out.println("Alice's age is: " + alice.getAge());
        System.out.println("Alice's gender is: " + alice.getGender());
        System.out.println("Alice's salary is: " + alice.getSalary());
    }
}
