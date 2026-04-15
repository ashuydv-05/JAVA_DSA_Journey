package conditional;
import java.util.*;
public class if_else_02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        if(a>=b&&b>=c&&c>=d&&d>=e){
            System.out.println("a is largest");
        }
        else if (b>=c && c>=d && d>=e) {
            System.out.println("b is largest");
        }
        else if(c>=d&&d>=e){
            System.out.print(" c is largest");
        }
        else if(d>=e){
            System.out.print("d is largest");
        }
        else {
            System.out.print("e is largest");
        }
       
        sc.close();
    }

    
}
