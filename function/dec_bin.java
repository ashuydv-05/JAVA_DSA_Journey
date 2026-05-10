package function;
import java.util.*;
public class dec_bin {
    //rev= rev*10=ld;
    //10%2=0
    //5%2=1
    //2%2=0
    //1%2=0
    public static int de_bin(int num){
        int ld;
        int bin=0;
        int pw=0;
        while(num>0){
            ld=num%2;
            //bin=(bin*10)+ld;
            bin=bin+(ld*(int)Math.pow(10,pw));
            num=num/2;
            pw++;
        }
        return bin;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the decimal value get the binary num");
        int dec=sc.nextInt();
        System.out.print(de_bin(dec));

        sc.close();
    }
    
}
