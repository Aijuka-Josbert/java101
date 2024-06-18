public class Person {
    // declaring data members
    private int age;
    private char gender;
    private String fullname;
    private float salary; // declaring data members ends here

    // setter for "Age"
    public void setAge(int age) {
        this.age = age;
    }

    // getter for "age"
    public int getAge() {
        computeAgeForFemales();
        return this.age;
    }

    // setter for "gender"
    public void setGender(char gender) {
        this.gender = gender;
    }

    // getter for "gender"
    public char getGender() {
        return this.gender;
    }

    // setter for "fullname"
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    // getter for "fullname"
    public String getFullname() {
        return this.fullname;
    }

    // setter for "salary"
    public void setSalary(float salary) {
        this.salary = salary;
    }

    // getter for "salary"
    public float getSalary() {
        return this.salary;
    }

    // Compute the real age of all females
    public void computeAgeForFemales() {
        if (getGender() == 'f' || getGender() == 'F') {
            this.age += 3;
        }
    }
}
