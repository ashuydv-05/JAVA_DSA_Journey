package pattern_adv;
import java.util.*;
public class hollow_rho {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the num for hollow rhombus");
        int n = sc.nextInt();
        
        for(int i = 1; i<=n;i++){
            //SPACES
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //f
            for(int j =1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                System.out.print("*");
            }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        
    }
}
