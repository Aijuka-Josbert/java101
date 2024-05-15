public class morant{
    // declarartion
    String fname;
    String lname;
    int age;
    String email;
    String professional;
    int salary;
    String location;
    String campus;
    String contact;
    String hobbies;


    //conecting my strings to my attributes in this case 
public void setFname(String fname){
this.fname = fname; }

public void setLname(String lname){
    this.lname = lname;
}
// preparing for printing
public String getBothnames(){
    return fname +" "+ lname;
}

public void setAge(int age){
    this.age = age;
}

// preparing to print age
public int getAge() {
    return age;
}
public String getnames(){
    return fname +" "+ lname + " "+ age ;
}
public void setEmail(String email){
    this.email = email;
}
public void setSalary(int salary){
    this.salary = salary;
}
public void setProfessional(String professional){
    this.professional = professional;
}
public void setLocation(String location){
    this.location = location;
}
public void setCampus(String campus){
    this.campus = campus;
}
public void setContact(String contact){
    this.contact = contact;
}
public void setHobbies(String hobbies){
    this.hobbies = hobbies;
}

    public static void main(String[] args) {
        morant myBio;
        myBio = new morant ( );
        
        myBio.setFname("JA");
        myBio.setLname("Morant🏀");
        myBio.setAge(21);
        myBio.setEmail("jamorant@gmail.com");
        myBio.setProfessional("Basketball player");
        myBio.setSalary(50000);
        myBio.setLocation("memphis");
        myBio.setCampus("Univeristy of Arizona");
        myBio.setContact("+1 345 789098");
        myBio.setHobbies("watching movies");

        //printing 
        System.out.println("My name is: "+ myBio.getBothnames());
        System.out.println("I am " +myBio.getAge()+ " years old.");
        System.out.println("I am " +myBio.getnames());
    }
}