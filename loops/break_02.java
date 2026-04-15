package loops;
import java.util.*;
public class break_02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int i = sc.nextInt();
            System.out.println(i);
            if(i%10==0){
                break;
            }
        }
        System.out.print("entered number is multiple of 10");

        
        sc.close();
    }
    
}
