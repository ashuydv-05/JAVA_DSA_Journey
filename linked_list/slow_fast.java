package linked_list;
// 876 Middle of the LL
class Node2{
        int data;
        Node2 next;
        // Constructor 
        Node2(int val, Node2 next){

            this.data = val;
            this.next = next;
        }
    }
public class slow_fast {
    public static Node2  middleNode(Node2 head){
        Node2 slow = head;
        Node2 fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node2 e = new Node2(500, null);
        Node2 d = new Node2(400, e);
        Node2 c = new Node2(300, d);
        Node2 b = new Node2(200, c);
        Node2 a = new Node2(100, b);
        // Node x = head;
        Node2 middle = middleNode(a);
        System.out.println(middle.data);        
    }
}
