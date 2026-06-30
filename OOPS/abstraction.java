package OOPS;

public class abstraction {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
    }
    
}

abstract class Animal_1{
    String color;
    Animal_1(){
        System.out.println("Animal constructor called...");
        color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal_1{
    Horse(){
        System.out.println("Horse constructor called...");
    }
    void change_color(){
        color = "black";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal_1{
    void change_color(){
        color = "pink";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}