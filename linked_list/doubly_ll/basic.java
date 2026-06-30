package linked_list.doubly_ll;

//Creating class of Doubly LL (User defined data structure)
class Node{
    int val;
    Node next;
    Node prev;
    //constructor making
    Node(int val){
        this.val = val;
    }
}
//User defined DLL
class DLL{
    Node head;
    Node tail;
    int size =0 ;

    //ADD AT HEAD
    void add_head(int val){

        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }
        else {
        temp.next = head;
        head.prev = temp;
        head = temp;
        }
        
        size ++;
    }

    //ADD AT TAIL
    void add_tail(int val){
        Node temp = new Node(val);
        if(tail == null){
            head= tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev= tail;
            tail=temp;
        }
        size++;
    }

    //DELETE HEAD
    void delete_head(){
        if(size == 1){
            head = tail = null;
        }

        if(head == null) {
            System.out.println("Error!!!!");
        }
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    //DELETE TAIL
    void delete_tail(){
        if(size == 1){
            head = tail = null;
        }

        if(tail == null){
            System.out.println("Error!!!!");
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    //DISPLAY
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    //DISPLAY REVERSE
     void display_rev(){
        Node temp = tail;
        while(temp != null){
            System.out.println(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println(" ");
    }

    //INSERT AT IDX 
    void insert(int idx , int val){
        //BASE CASE;
        if(idx == 0) add_head(val);
        if(idx == size) add_tail(val);
        if(idx < 0 || idx > size ) {
            System.out.println("Error!!!");
            return ;
        }
        Node nn = new Node(val);
        Node temp = head;
        for(int i = 0 ;i< (idx -1) ; i++){
            temp = temp.next;
        }
        nn.next = temp.next;
        nn.prev = temp;
        temp.next = nn;
    
    }

}

public class basic {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.add_head(10);
        list.add_head(20);
        list.add_head(30);
        list.add_head(40);
        list.display();
        System.out.println("printing reverse order");
        list.display_rev();
        list.delete_tail();
        list.display();
    }
    
}
