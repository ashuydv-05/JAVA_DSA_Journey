package OOPS;

public class basic {
    public static void main(String args[]){
        // object creation
        Pen p1 = new Pen();
        // p1.setcolor("RED");
        // p1.color = " BLUE";
        // System.out.print(p1.color);

        // //object creation.
        // BankAc myacc = new BankAc();
        // myacc.username="ashu yadav";
        // //Cant able to acces password attribute because its PRIVATE;
        // // myacc.password= "asduas";
        // myacc.setpwd("!@#$");
        // // System.out.println(myacc.password);
        // System.out.println(myacc.username);




    }
    
}
//bank account class;
class BankAc{
    public String username;
    private String password;
    public void setpwd(String pwd){
        password = pwd;
    }
}


//class created provides the blueprint to this.
class Pen{
    //Properties of class
    String color = "red";
    int tip =5;
    //method / function of the class;
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip( int newtip){
        tip=newtip;
    }

    //CONSTRUCTOR
    Pen(){
        System.out.print(this.color+" "+ this.tip);
    }
}

