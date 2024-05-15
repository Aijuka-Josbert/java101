package com.oop;

class FullTimestaff extends Main{
public String course;
public String fetchEmail(){
    return "Hi, this is my email " + email;
}
}
class PartTimestaff extends Main{
    public String getEmpfullname(){
        return "Hello World, my name is " + fname +" "+ lname;
    }
    protected String getAge(){
        return  age + " years old";
    }
}
public class Main {
    public String fname;
    public String lname;
    public String email;
    public int age;
    String gender;
    private String Location;
    //public Main(String fname, String lname, String email, int age, String gender){
       // this.fname = fname;
       // this.lname = lname;
       // this.age = age;
       // this.gender = gender;
       // this.email = email;
   // }
   
    public String getEmpfullname(){
        return fname +" "+ lname;
    }
    private String getGender(){
        return "I am a " + gender;
    }
    protected String getAge(){
        return "I am " + age + " years old";
    }
    public void setFName(String name){
        this.fname = name;
    }
    public void setLName(String lname){
        this.lname = lname;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setEmail(String email){
        this.email = email;
    }
    private void setLocation(String location){
        this.Location = location;
    }
    public static int multiply(int a, int b){
        return a * b;//1 * 1 = //Error
    }


    public static double multiply(double a, double b){
        return a * b;//5.5 *6.6
    }

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        FullTimestaff mFullTimestaff = new FullTimestaff();
        PartTimestaff mPartTimestaff = new PartTimestaff();
        Main mymain = new Main();
        mFullTimestaff.setFName("Plascua");
        mFullTimestaff.setLName("Admin");
        mFullTimestaff.setEmail("jmuganji@umu.ac.ug");
        mFullTimestaff.setGender("Male");
        
        mymain.setFName("Muganji");
        mymain.setLName("Julius");
        mymain.setEmail("muganji93@gmail.com");
        mymain.setGender("Male");
        mymain.setLocation("Kampala");

        mPartTimestaff.setFName("Nathan");
        mPartTimestaff.setLName("Mukasa");
        mPartTimestaff.setEmail("nmukasa@umu.ac.ug");
        mPartTimestaff.setGender("Male");
        mPartTimestaff.getAge();

        System.out.println(mFullTimestaff.getEmpfullname());
        System.out.println(mFullTimestaff.fetchEmail());
        System.out.println(mPartTimestaff.getEmpfullname());
        System.out.println(mymain.getEmpfullname());
        System.out.println(mymain.getGender());
        System.out.println(mymain.multiply(1,2));
        System.out.println(mymain.multiply(5.5,6.5));
    }
}