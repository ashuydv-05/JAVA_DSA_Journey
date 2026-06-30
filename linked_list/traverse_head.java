package linked_list;
//USED to traverse with HEAD element ;
class Node2{
        int data;
        Node2 next;
        // Constructor 
        Node2(int val){
            this.data = val;
        }
    }
public class traverse_head {
    //PRINTING THE LL
    public static void display(Node2 head){
        //Node1 temp = head;
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }
        //WITH BELOW CODE , print all the element of the linkedlist except last one.
         //Node1 temp = head;
        // while(temp!=tail){ 
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }

        //USING FOR LOOP
        for(Node2 temp = head;temp!=null;temp = temp.next){
            System.out.print(temp.data+" ");

        }
    }
    // PRINTING LL WITH REC
    public static void display_rec(Node2 head){
        //base case
        if(head == null) return;
        display_rec(head.next);
        System.out.println(head.data+" ");
    }

    //ACCESS LL WITH INDEX NO (0 BASED INDEX){
    public static int get(Node2 head,int idx){
        Node2 temp = head;
        for(int i = 0; i<idx;i++){
            temp = temp.next;
        }
        // System.out.println(temp.data);
        return temp.data;
    }

    //ACCESS LL WITH INDEX NO (0 BASED INDEX) WITH REC
    public static int get_rec(Node2 head, int idx){
        //EDGE case
        if(head==null) return -1;
        //Base case
        if(idx==0) return head.data;
        // int temp = get_rec(head, idx-1);
        return get_rec(head.next, idx-1);
        //  return temp.next.data;
    }
     
    // //ACCESS LL WITH INDEX NO (0 BASED INDEX) WITH REC
    // public static int get_rec(Node head, int idx){
    //     //Base case
    //     if(idx==0) return head.data;
    //     return get_rec(head.next, idx-1);
    // }


    public static void main(String args[]){
        Node2 a = new Node2(10);  //HEAD NODE
        Node2 b = new Node2(20); 
        Node2 c = new Node2(30); 
        Node2 d = new Node2(40); 
        Node2 e = new Node2(50);//TAIL NODE

        //Connection or link setup;

         a.next =b;
         b.next = c;
         c.next = d;
         d.next= e;

        // display(a);
        //display_rec(a);
        // System.out.println(get(a,2));
        System.out.println(get_rec(a, 5));

    }

    
}
