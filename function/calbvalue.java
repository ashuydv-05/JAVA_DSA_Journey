package function;

public class calbvalue {
    public static void change(int a){
        a=20;
        System.out.println("a(in change function) ="+a);
    }
    public static void main(String args[]){
        int a =10;
        change(a);
        System.out.println("a(in main) ="+a);

    }
    
}
