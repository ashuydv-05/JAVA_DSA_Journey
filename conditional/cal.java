package conditional;
import java.util.*;
public class cal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two num\n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the symbol, relates to particular operation");
        char c = sc.next().charAt(0);
        switch(c){
            case '+':
                    int sum = a + b;
                    System.out.print(sum);
                    break;
            case '-':
                    int sub = a - b;
                    System.out.println(sub);
                    break;
            case '*':
                    int mul=a*b;
                    System.out.print(mul);
                    break;
            case '/':
                    if(b>0 || b<0){
                    int div=a/b;
                    System.out.print(div);
                    }
                    else{
                    System.out.print("Cannot divde by zero");
                    }
                    break;
            case '%':
                    if(b>0 || b<0){
                    int mod=a%b;
                    System.out.print(mod);
                    }
                    else{
                    System.out.print("Cannot divide by zero");
                    }
                    break;
            default:
                System.out.println("NA");
                break;
        }
        sc.close();
        
        
    }
    
}
