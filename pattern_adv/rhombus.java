package pattern_adv;
import java.util.*;
public class rhombus {
    public static void main(String args[]){
        System.out.print("Enter the num for Rhombus");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        //outer loop
        for(int i = 1; i<=n;i++){
            //space n-1 time
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    
}
}

 