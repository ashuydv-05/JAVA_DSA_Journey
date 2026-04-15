package loops;
//REVERSE A NUMBER
import java.util.*;
public class for_04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        while(n>0){
            int ld=n%10;
            n=n/10;
            rev=(rev*10)+ld;
        }
        System.out.print(rev);
        sc.close();
    }
    
}
