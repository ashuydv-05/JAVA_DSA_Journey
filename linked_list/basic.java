package linked_list;
class Node1{
    int data;
    Node1 next; //  refer to address of next node 
}
public class basic {
    public static void main(String args[]){
        //node creation 10 20 30 40 50;
        Node1 a = new Node1(); a.data=10; //HEAD NODE
        Node1 b = new Node1(); b.data=20;
        Node1 c = new Node1(); c.data=30;
        Node1 d = new Node1(); d.data=40;
        Node1 e = new Node1();//TAIL NODE

        // //Connection or Link setup 
         a.next =b;
         b.next = c;
        // c.next = d;
        // d.next= e;
        System.out.println(a.data);
        System.out.println(a.next);//adres of b node
        System.out.println(b); // adress of b ;
        System.out.println(e.data); //no value = 0;
        System.out.println(e.next); //since tail node = null
        //below all the print statements print the 
        // adres of c 
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);
        
        /*
        By Default
        data = 0
        next = null;
         */

        
    }
}
