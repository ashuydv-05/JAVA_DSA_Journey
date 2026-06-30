package OOPS;
// Method overridding.
public class m_overriding {
    public static void main(String args[]){
        Dog d1 = new Dog();
       d1.eat();
       Animal a1 = new Animal();
       a1.eat();
    }
    
}
class Animal{
    String colour;
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dogs eats");
    }
}
