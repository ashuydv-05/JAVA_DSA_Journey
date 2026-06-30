package recursion;

public class basic {
    public static void one_n(int x,int n ){
        //x is current iterable variable;
        //BASE CONDITION 
        if(x>n) return;
        System.out.println(x);
        one_n(x+1, n);
    }

    public static void print(int n){
        if( n ==0) return;
         System.out.println(n);
        print(n-1);
        // System.out.println(n);
    }

    //FACTORIAL
    public static int fac(int n){
        if(n==0) return 1;
        int x = n * fac(n-1);
        // System.out.println(x);
        return x;

    }
    public static void main(String args[]){
        print(5);
        // one_n(0, 10);
    //    System.out.println(fac(3));
    }

    
}
