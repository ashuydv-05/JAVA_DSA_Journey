package array_list;
import java.util.*;
public class basic_1 {
    public static void main(String[] args) {
        //ARRAY LIST DECLARATION 
        ArrayList<Integer> ls = new ArrayList<>();
        // OPERATION ON ARRAY LIST
        //1. add element
        ls.add(234); //TC = O[1];
        ls.add(432);
        ls.add(345);
        ls.add(10);
        ls.add(24);
        ls.add(69);
         System.out.println(ls);
        //ADDING AT PARTICULAR INDEX
        ls.add(4, 20); //O(n)
        System.out.println(ls);

        System.out.println(ls.size());


        // //2. Get element to access element, ulike array - arr[i];
        // int element = ls.get(1); //O(1)

        // //3. remove element
        // ls.remove(1); // O(n) - linear, first search then remove

        // //4. Set Element at Index
        // ls.set(0,10); // O(n) - linear, first search then remove

        // //5 Contains Elements
        // //check whether particular element is there or not
        // System.out.println(ls.contains(1));
        // System.out.println(ls.contains(45));
 
        // // System.out.println(ls);
        // // System.out.println(element);
        // System.out.println(ls);


    }
    
}
