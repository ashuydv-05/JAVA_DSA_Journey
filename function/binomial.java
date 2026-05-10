package function;
import java.util.*;
public class binomial {
    public static int fact(int a){
        int fac=1;
        for(int i = 1; i<=a;i++){
            fac=fac*i;
            //System.out.println(fac);
            
        }
        return fac;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int n_f=fact(n);
        int r_f=fact(r);
        int n_r= n-r;
        int n_r1= fact(n-r);
        int Binomial_c=((n_f)/(r_f*n_r1));
        System.out.print("Binomial Coeffient = "+ Binomial_c);

    }

    
}
