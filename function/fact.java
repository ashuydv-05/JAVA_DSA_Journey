package function;
import java.util.*;
public class fact {
    public static int fact(int n){
        int fac=1;
        for(int i =1; i<=n;i++){
            fac=fac*i;
            
        }
        System.out.print("Factorial of the above entered number is "+ fac);
        return fac;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get the factorial");
        int num= sc.nextInt();
        fact(num);  

    }
    
}
