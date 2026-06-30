package basics;

public class fibonacci {
    public static int nthFibonacci(int n) {
        // code here
        if(n<=1) return 1;
        return nthFibonacci(n-1)+ nthFibonacci(n-2);
    }
    public static void main(String args[]){
        // int a = 0;
        // int b =1;
        // int n = 5; //no. of the term to print
        // for(int i=1;i<=n;i++){
        //     int ans = a+b;
        //     System.out.println(ans+" ");
        //     a=b;
        //     b=ans;
        // }
        // nthFibonacci(5);
        System.out.println(nthFibonacci(5));
    }

    
}
