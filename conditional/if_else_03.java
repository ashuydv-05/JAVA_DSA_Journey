package conditional;
import java.util.*;
public class if_else_03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        float tax = 0;
        if(income<=500000){
           System.out.println("Congratulation You are Tax Free");
        }
        else if(income > 500000 && income <= 1000000){
            tax = 0.2f * income;
            
        }
        else if(income>1000000){
            tax = 0.3f * income;
            //System.out.println(tax);
        }
        System.out.println(tax);
        sc.close();
    }
    
}
