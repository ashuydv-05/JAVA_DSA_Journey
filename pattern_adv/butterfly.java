package pattern_adv;
import java.util.*;
public class butterfly {
    public static void main(String args[]){
        System.out.print("Enter the num for Butterfly");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        //For printing ButterFly
        //first half.
        for(int i =1;i<=n;i++){
            //start
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i =n;i>=1;i--){
            //start
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }


        sc.close();
        }
    }
    
    

