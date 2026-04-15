package function;
import java.util.*;
public class sum {
    public static int sum(int n1, int n2){ // parameter or formal parameter
        int sum;
        sum=n1+n2;
        //System.out.print("Sum ="+sum);
        return sum;

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum_1 =sum(num1,num2);// arguments or actual parameters
        System.out.print(sum_1);
      
        sc.close();
    }
    
    
}
