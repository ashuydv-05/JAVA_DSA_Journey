package linked_list;

 //User defined Data Structure
    class Node{
        int data;
        Node next;
        // Constructor 
        Node(int val){
            this.data = val;
        }
    }

    // User defined LL
    class LinkedList{
        Node  head;
        Node tail;
        int size =0;

        // Get or access data particular index
        int get(int idx){
            Node temp = head;
            if(head==null) return -1;
            for(int i =0 ;i <idx;i++){
                temp = temp.next;
            }
            return temp.data;
            }
            
        //SEARCH AN ELEMENT
        boolean search(int data){
            Node temp = head;
            int idx =0;
            while(temp != null){
                if(temp.data == data) {
                    System.out.println("Index position is:" + idx);
                    return true;
                }
                temp = temp.next;
                idx++;
            }
            return false;
        }

        //ADDING AT TAIL
        void add_tail(int val){
            Node temp = new Node(val);
            if(tail == null) head = tail = temp;
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        //ADDING AT HEAD
        void add_head(int val){
            Node temp = new Node(val);
            if(head == null) head = tail = temp;
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        //Delete at Head
        void delete_head(){
        if(head == null){
            System.out.println("Nothing is there in the linkedlist");
            return;
        }
        head = head.next;
        size--;
        }

        //Delete at the Tail
        void delete_tail(){
            if(head == null) {
                System.out.println("No element , No action");
            }
            if(head == tail){
                head = null;
                tail = null;
            }
            //An pointer 
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            // temp.next = tail; //second last element
            temp.next = null;
            tail = temp;
            size--;
         }

        //  Delete at specific INDEX
        void delete( int idx){
            if(idx<0 || idx>=size){
                System.out.println("Invalid Index");
                return;
            }
            if(idx ==0) {
                delete_head();
                 return;
            }
            Node temp = head;
            if(idx == size -1){ 
                tail = temp;
                size --;
            }
            for(int i =0 ;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;

        }

         //INSERT AT SPECIFIC INDEX
         void insert(int data , int idx){
            if(idx<0 || idx>size) {
                System.out.println("Invalid Index");
            }
             if(idx == 0) {
                add_head(data);
                return;
            }
            if(idx == size ) {
                add_tail(data);
                 return;
            }
            Node temp = head;
            Node t1 = new Node(data);
            int n = 0;
            while(n < (idx -1) ){
                temp = temp.next;
                n++;
            }
            t1.next = temp.next ;
            temp.next = t1;
         }
       
        
    }

public class add_head_tail {
    public static void display(Node head){
            if(head == null) return;
            Node temp = head;
            while(temp!= null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        // DOUBT HERE
        
    // public static void delete_head(Node head){
    //     if(head == null){
    //         System.out.println("Nothing is there in the linkedlist");
    //         return;
    //     }
    //     head = head.next;
    // }
    public static void main(String[] args) {
        //Object creation ..
        LinkedList ll = new LinkedList();
        ll.add_tail(10);
        ll.add_tail(20);
        ll.add_tail(30);
        // // display(10)
        // // display(ll.head);
        // ll.add_head(100);
        // display(ll.head);
        // // delete_head(ll.head);
        // ll.delete_head();
        // display(ll.head);
        // ll.delete_tail();
        // display(ll.head);
        // System.out.println(ll.search(20));
        // display(ll.head);
        ll.insert(69,2);
        ll.delete(2);
        display(ll.head);



       

    }
    
}
