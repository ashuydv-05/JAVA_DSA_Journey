package function;
import java.util.*;
public class sum {
    public static int sum(int n1, int n2){ // parameter or formal parameter
        // int sum;
        // sum=n1+n2;
        //System.out.print("Sum ="+sum);
        return n1+n2;

    }
    public static double sum(double n1,double n2,double n3){
        return n1+n2+n3;
    }

    public static void main(String args[]){
        // Scanner sc= new Scanner(System.in);
        // int num1=sc.nextInt();
        // int num2=sc.nextInt();
        // int sum_1 =sum(num1,num2);// arguments or actual parameters
        // System.out.print(sum_1);
        //int r1= sum(32,32);
        //int r2 = sum(43,43,53);
        System.out.println(sum(32,32));
        System.out.println(sum(43.5,43.03,53.34));

      
        //sc.close();
    }
    
    
}
