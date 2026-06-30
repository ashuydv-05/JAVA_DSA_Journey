package OOPS;
// ENCAPSULATION
public class get_set {
    public static void main(String args[]){
        //object creation
        Bike b1 = new Bike(); 
        // cant access since model(attributes is declared in private access modifier);
        //System.out.print(b1.model);
        System.out.println(b1.getmodel());
        //setting the model
        b1.setmodel("bullet");
        System.out.println(b1.getmodel());

    }
    
}

class Bike{
    private String model;
    private int cost;


    //get function 


    // this object is used to refer to the current object
    String getmodel(){
        return this.model;
    }
    int getcost(){
        return this.cost;
    }

    // set 
    void setmodel(String new_1){
        this.model = new_1;
    }

    void setcost(int cost_n){
        this.cost= cost;
    }


}