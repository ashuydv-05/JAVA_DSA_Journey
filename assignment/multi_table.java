package assignment;
import java.util.*;
public class multi_table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num to print Mutlipication table");
        int num= sc.nextInt();
        for(int i = 1;i<=10;i++){
            int val= num*i;
            System.out.println( num +"X"+ i + "=" +  val);
        }
        sc.close();
    }
    
}
