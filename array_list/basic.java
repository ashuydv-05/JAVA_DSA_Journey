package array_list;
import java.util.*;
import java.ArrayList;
public class basic {
    // TAKING INPUT TO ARRAYLIST
    //
    public static void ip_op(ArrayList<Integer> arr){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the numbers of elements to store");
         int n = sc.nextInt();
         for(int i =0;i<n;i++){
            arr.add(sc.nextInt());
         }
    }
    public static void main(String args[]){
    //similiar to datatype of list in python
    
    ArrayList<Integer> arr = new ArrayList<>();
    //int arr[] = new int[n];
    arr.add(10); //arr[0] = 10;
    arr.add(20);
    arr.add(50);
    arr.set(1,30); //arr[1]=30
    int n = arr.size(); //arr.length
    System.out.println(arr.get(0));
    for(int i=0;i<n;i++){
        System.out.println(arr.get(i));
    }


    }
}
