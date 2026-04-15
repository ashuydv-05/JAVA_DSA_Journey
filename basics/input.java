// Getting input from user, use next() function

package basics;

import java.util.*;
    public class input{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            // String name = sc.next(); 
            // System.out.println(name);
            // System.out.println("Enter the number to print");
            // int num = sc.nextInt();
            // System.out.println(num);
            String name1 = sc.nextLine();
            System.out.println(name1);
            
            sc.close();
        }
    }

    /*
    next -> first word of the sentence 
    nextInt -> get integer input
    nextLine -> get full sentence as input
     */

