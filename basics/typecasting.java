
package basics;

import java.util.*;
public class typecasting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //float a = sc.nextFloat();
        //int b=a; //LEAD TO ERROR
        //int b = (int)a;  EXPLICIT CONVERSION
        //System.out.println(b);
        char ch = sc.next().charAt(0);
        
        int num1 = ch;
        System.out.println(num1);
        sc.close();
    }
    
}
 