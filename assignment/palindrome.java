package assignment;
import java.util.*;
public class palindrome {
    public static int rev(int n){
        int ld,rev=0;
        while(n>0){
        ld=n%10;
        rev=(rev*10)+ld;
        n=n/10;
    }
        System.out.println("Reverse num is "+rev);
        return rev;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int num= sc.nextInt();
        if(num==rev(num)){
            System.out.println("Number ="+num + "is Palindrome number");
        }
        else{
            System.out.print("Number is not Palindrom");
        }

        sc.close();
    }
    
}
