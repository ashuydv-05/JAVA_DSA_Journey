//ODD_EVEN
package conditional;
import java.util.*;
public class if_else_01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.print("EVEN");
        }
        else{
            System.out.print("odd");

        }
        sc.close();
    }
    
    
}
