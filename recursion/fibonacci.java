package recursion;

public class fibonacci {
    public static int nthFibonacci(int n) {
        // code here
        if(n<=1) return 1;
        return nthFibonacci(n-1)+ nthFibonacci(n-2);
    }
    public static void main(String args[]){
        System.out.println(nthFibonacci(5));
    }

    
}
