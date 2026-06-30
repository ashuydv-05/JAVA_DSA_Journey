package stacks;
import java.util.*;
public class add_get_delete {
    //ADD AT PARTICLAR INDEX
    public static void add(int idx, int element, Stack<Integer> st1){
        Stack<Integer> st2 = new Stack<>();
        while(st1.size() > idx ){
            st2.push(st1.pop());
        }
        st1.push(element);
        while(st2.size() > 0){
            st1.push(st2.pop());
        }
    }
    //DELETE AT PARTICULAR INDEX
    public static void delete(int idx, Stack<Integer> st1){
        Stack<Integer> st2 = new Stack<>();
        while(st1.size() > idx+1){
            st2.push(st1.pop());
        }
        st1.pop();
        while(st2.size() > 0){
            st1.push(st2.pop());
        }
    }
    //PRINT THE ELEMENT AT PARTICULAR INDEX
    public static void get(int idx, Stack<Integer> st1){
         Stack<Integer> st2 = new Stack<>();
        while(st1.size() > idx+1){
            st2.push(st1.pop());
        }
        System.out.println(st1.peek());
        while(st2.size() > 0){
            st1.push(st2.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(40);
        st.push(30);

        //GET (idx = 2) 
        get(2, st);
       
        //ADD(2 , 50)
        add(2,50,st);
        System.out.println(st);

        //DELETE(idx 2)
        delete(3, st);
        System.out.println(st);
    }
    
}
