package basics;

//Widening.. int get into long smoothly.
// vice versa not possible -> LOSSY CONVERSION
import java.util.*;
public class widening_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter int");
        int a = sc.nextInt();
        long b = a;
        // long c = sc.nextLong(); // LOSSY CONVERSION
        // int d = c; // lossy conversion

        System.out.print(b);

        sc.close();
        
    }

    
}
