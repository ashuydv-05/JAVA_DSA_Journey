package loops;
import java.util.*;
public class continue_02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int i = sc.nextInt();
            if(i%10==0){
                //break;
                continue;
            }
            System.out.println(i);
            sc.close();
        }
        

        
        
    }
    
}
