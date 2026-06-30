package OOPS;

public class interfac_1 {
    public static void main(String args[]){
        bear b1 = new bear();
        b1.eat();
    }
}
interface herbivore{
    void eat();
}
interface carnivore{
    void eat();
}
class bear implements herbivore,carnivore{
    public void eat(){
        System.out.println("eats both grass & meet");
    }
}