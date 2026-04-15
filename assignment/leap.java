package assignment;
import java.util.*;
public class leap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        boolean x=a%400==0;
        boolean y=a%100!=0;
        boolean z=a%4==0;
        if( x ||(z&&y)){
            System.out.println("Leap year");
        }
        else{
            System.out.print("NOT LEAP YEAR");
        }
        sc.close();

    }
    
}
