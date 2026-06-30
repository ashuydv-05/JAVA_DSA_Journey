package OOPS;

/* There are 4 types of inheritance:
1. Single level Inheritance.
2. Multi level Inheritance.
3.Hierarchial Inheritance.
4. Hybrid Inheritance . */
public class inheritance {
    public static void main(String args[]){
        // fish shark = new fish();
        // shark.eat();
        Dogs tommy = new Dogs();
        tommy.legs = 4;
        tommy.legs();
        tommy.eat();
    
    
}}
//BASE CLASS
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println( "breaths");
    }
}
//1st Derived Class
class Mammals extends Animal{
    int legs;
    void legs(){
    System.out.println("Legs ="+legs);}
}
// 2nd Derived Class
class Dogs extends Mammals{
    String bread;
}


//DERIVED CLASS

// class fish extends Animal{
//     int fins;
// }


