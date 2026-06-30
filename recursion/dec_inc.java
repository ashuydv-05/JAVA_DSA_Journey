package recursion;

public class dec_inc {
    public static void main(String args[]){
        int x =5;
        // print_d(x);
        // print_i(x);
        print(x);
        
    }

    //INDIVIDUAL PRINT DEC AND INC USING TWO FUNC
    public static void print_d(int n){
        if (n ==0) return;
        System.out.println(n);
        print_d(n-1);
    }
    public static void print_i(int n){
        if(n==0) return ;
        print_i(n-1);
        System.out.println(n);
    }

    //NOW WITH ONLY ONE FUNCTION
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
        if(n!=1) System.out.println(n);
    }
    
}
