package recursion;

public class global_v {
    //Global Variable: 
    static int n;
    public static void main(String args[]){
        n= 10;
        // print(1);
        int z= 23;
        print_1(z);
    }

    public static void print(int y){
        if(y>n) return ;
        System.out.println(y);
        print(y+1);
    }

    public static void print_1(int x){
        if(x<0) return;
        print_1(x-1);
        System.out.println(x);
    }
}
