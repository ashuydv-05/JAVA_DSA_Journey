//SWAP & PRODUCT (NESTED FUNCTION)
package function;
import java.util.*;
public class prod {
    public static void swap(int a, int b){
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.print("After swapping number are");
        System.out.print("a ="+a);
        System.out.print("b ="+b);
        prod(a,b);
    }
    public static void prod(int n1, int n2){
        int pro;
        pro=n1*n2;
        System.out.print("Product of the numbers are= "+pro);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number to get the products");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        swap(num1,num2);

    }
    
}
