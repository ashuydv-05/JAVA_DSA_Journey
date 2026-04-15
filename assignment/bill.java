package assignment;
import java.util.*;
public class bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float tpen= 0.18f * pen; // normal decimal value are consider as double in java.
        float tpencil=0.18f*pencil;
        float teraser=0.18f*eraser;
        float total = tpen+tpencil+teraser;
        System.out.print("Total bill.  =" +   total); // no cooma in print statement in java.
        sc.close();
        

    }
    
}
