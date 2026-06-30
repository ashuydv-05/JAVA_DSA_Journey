package stacks;
//TRAVERSING STACK WITH ANOTHER STACK 
//TC = O(n) ; SC = O(n)
import java.util.*;
public class traverse_w_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element to put in stack");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int count = 0;
        while(count<n){
            System.out.println("Enter the element 1 by 1");
            int m = sc.nextInt();
            st.push(m);
            count++;
        }

        System.out.println("Stack is having following elements");
        System.out.println(st);

        //PRINTING ELEMENT WITH ANOTHER STACKS;
        Stack<Integer> st2 = new Stack<>();
        while(st.size() > 0){
            int top = st.pop();
            System.out.print(top +" ");
            st2.push(top);
        }

        //ANOTHER STACK IS FULLED WITH THE ELEMT OF ST 
         System.out.println("Finally printing the  second stack ");
        System.out.println(st2);

        //FILLING AGAIN THE ELEMENTS OF STACK2 BACK TO STACK 1
        while(st2.size()>0){
            st.push(st2.pop());
        }

        System.out.println("Finally printing the  first stack ");
        System.out.println(st);
        




    }
    
}
