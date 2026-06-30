package OOPS;
// Fun
import java.util.*;
public class m_overloading {
    public static void main(String args[]){
    Calculator c1 = new Calculator();
    // System.out.print(c1.sum(34.5f,653.3f));
    System.out.println(c1.sum());
}}

class Calculator{
    int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a+b;
    }
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b ,int c){
        return  a+b+c;
    }
}