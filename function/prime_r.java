package function;
import java.util.*;
public class prime_r {
    public static boolean Isprime(int n){
        boolean Isprime=true;
        if(n==1){
            System.out.println("Entered number is 1, not prime nor composite");
        }
        if(n==2){
            Isprime = true;
        }
        
        for(int i = 2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            Isprime = false;
        }
    }
    return Isprime;
}
     

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which u want prime number");
        int num=sc.nextInt();
        for(int j=2;j<=num;j++){
            
            if(Isprime(j) == true){
                System.out.println("Prime number="+j);
            }
            else{
                System.out.println(j);
            }



        }

        sc.close();
    }
    
}
