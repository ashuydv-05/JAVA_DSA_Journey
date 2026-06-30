package stacks;
//ADD ELEMENT AT BOTTOM USING RECURSION
import java.util.*;
public class add_b_rec {
    public static void add_b(int x , Stack<Integer> st){
        //base case
        if(st.size() == 0){
            st.push(x); 
            return;
        }
        int temp = st.pop();
        add_b(x, st);
        st.push(temp);
    }

    public static void reverse(Stack<Integer> st){
        //base case
        if(st.size() == 0){
            return;
        }
        int temp = st.pop();
        reverse(st);
        add_b(temp, st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        add_b(101,st);
        System.out.println(st);

        reverse(st);
        System.out.println("Reverse stack is");
        System.out.println(st);
    }
}
