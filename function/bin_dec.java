package function;
import java.util.*;
public class bin_dec {
    public static int bin_de(int a){
        
        int pw=0;
        int de=0;
        while(a>0){
            int lastDigit = a%10;
            de=de+(lastDigit * (int)Math.pow(2,pw));
            a=a/10;
            pw++;
        }
        return de;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number");
        int binary=sc.nextInt();
        System.out.println("Decimal value of Binary number=" + bin_de(binary));

        sc.close();


    }
    
}
