package stacks;

import java.util.Stack;

public class basic {
 public static void main(String[] args) {
    //DEFINING STACK DATA STRUCTURE
    Stack<String> st = new Stack<>();

    /* PUSHING THE ELEMENTS IN THE STACK
    with operation called
    st.push(Element or content----);


    st.pop - for remove the element that is at top
    this return the topmost element and then removes it also ,
    where as in C++ the return type of the pop is VOID.


    st.peek() - this is used to print the topmost element;

     */

     st.push("lal babu");
     st.push("rekha devi");
     st.push("priti kumari");
     st.push("ashu yadav");

     System.out.println(st); // used to print all the element in the stack S.C- O(n)
     System.out.println(st.peek()); //used to print the topmost element;
     st.pop();
     System.out.println(st);

     System.out.println(st.size()); // print the size of the stack

     System.out.println(st.pop());
     System.out.println(st);
 }   
}
 