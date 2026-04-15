package loops;
import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean isPrime = true;
        if(n==2){
            System.out.print("Number is prime");
        }
       // for(int i=2;i<=n-1;i++){// LOOP RUN FOR N-2 TIMES.
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
            }
            
        }
        if(isPrime==true){
            System.out.print("Number is prime");

        }
        else{
            System.out.print("Number is NOTprime");
        }
    }
    
}
