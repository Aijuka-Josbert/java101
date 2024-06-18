public class Words {
    static void myMethod(String fname, String lname, int age){

       // System.out.println(fname + " Wokrach");
        System.out.println(fname +" "+lname + " is "+ age);
    
    }
    public static void main(String[]args){
        myMethod("Kawambe","Samantha",19);
        myMethod("Mess","Lunatic",21);
        //newMethod();
       // newMethod();
       // newMethod();
    //create an instance of more class to call the newMethod();
    More moreObj = new More();
        moreObj.newMethod("Morgan", 22, "Odwong");
        moreObj.newMethod("Ian", 21, "Kwagala");
        moreObj.newMethod("Ruth", 17, "Kebesa");
    }  
}

class More extends Words{

    void newMethod(String lname, int age, String fname){
        
        System.out.println(fname + " "+lname + " is "+ age);
    }
    //public static void main(String []args){
       // Words.myMethod("Kawambe","Wokrch",34);
       /// newMethod("Morgan", 22, "Odwong");
        //newMethod("Ian",21,"Kwagala");
        //newMethod("Ruth", 18,"Kebesa");
   // }
}
