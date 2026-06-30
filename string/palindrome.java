package string;
import java.util.*;
public class palindrome {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.next();
        int i =0 , j = str.length()-1;
        //System.out.println(str.charAt(i));
        //System.out.println(str.charAt(j));
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)) {
               System.out.println("Not Palindrome");
                return;
                }
            i++;
            j--;
             }
            System.out.println("Palindrome");

    
    }
}