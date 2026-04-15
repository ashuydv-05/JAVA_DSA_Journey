package assignment;
import java.util.*;
public class sum_oddeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers");
        int even_cout=0;
        int even_sum=0;
        int odd_cout=0;
        int odd_sum=0;
        for(int i =0;i<5;i++){
            int num= sc.nextInt();
            if(num%2==0){
                even_cout++;
                even_sum+=num;
                
            }
            else{
                odd_cout++;
                odd_sum+=num;
            }

        }
        System.out.println("Even number"+even_cout);
        System.out.println("Even sum"+even_sum);
        System.out.println("Odd number"+odd_cout);
        System.out.println("Odd number"+odd_sum);


        
}
}

