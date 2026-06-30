package stacks;

class Node{
    int val;
    Node next;
    Node(int data){
        this.val = data;
    }
}

class LLStack{
    Node head;
    int len;
    int peek() throws Exception{ //HEAD VALUE
        if(head == null){
            throw new Exception("Stack Underflow Error");
        }
        else {
            return head.val;
        }
    }

    // int pop(){ //DELETE AT HEAD
    //     if(head == null){
    //         System.out.println("!!!ERROR!!!");
    //         return -1;
    //     }
    //     int x = head.val;
    //     head = head.next;
    //     len--;
    //     return x;
        
    // }

    int pop() throws Exception{ //DELETE AT HEAD
        if(head == null){
            throw new Exception("Stack Underflow Error");
        }
        int x = head.val;
        head = head.next;
        len--;
        return x;
        
    }



    void push(int element){
        // create new node
        Node temp = new Node(element);
        temp.next = head;
        head = temp;
        len++;
    }
    // RETURN THE SIZE LENGTH OF THE STACK
    int size(){
        return len;
    }

    //DISPLAY STACK
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        // System.out.println();
    }
}

public class stack_ll {
    public static void main(String[] args) throws Exception {
        //CREATE NEW STACK WITH NEWLY CREATED FUNCTION
        LLStack st = new LLStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        // st.display();

        st.pop();
        st.display();
    
    }
    
}
