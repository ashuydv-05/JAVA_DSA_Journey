package array_list;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        //ARRAY LIST DECLARATION
        ArrayList<Integer> ls = new ArrayList<>();
        gets(ls);
        reverse(ls);
        // print(ls);
        System.out.println(ls);
        
    }

    //Get the user input
    public static void gets(ArrayList<Integer> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element of array list");
        int n = sc.nextInt();
        for(int i = 0 ; i< n;i++){
            int x = sc.nextInt();
            list.add(x);
        }
    }
    
    //REVERSE 
    public static void reverse(ArrayList<Integer> list){
        int i = 0;
        int j = list.size() - 1;
        while(i<=j){
            //swap
            int temp = list.get(i);
            // list.get(i) = list.get(j);
            list.set(i,list.get(j));
            // list.get(j) = temp;
            list.set(j,temp);
            i++;
            j--;
        }
    } 

    //PRINTING the array list
    public static void print(ArrayList<Integer> list){
        int n = list.size();
        for(int i = 0;i<n;i++){
            System.out.println(list.get(i));
        }

    }
}
