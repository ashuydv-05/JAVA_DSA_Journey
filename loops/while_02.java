//print sum of n number;
package loops;
import java.util.*;
public class while_02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num , till which u want the sum");
        int n = sc.nextInt();
        int c=0;
        int sum=0;
        while(c<=n){
            sum=sum+c;
            c++;
            
        }
        System.out.print("Sum of n numbers "+sum);
        sc.close();
    }
    
}
