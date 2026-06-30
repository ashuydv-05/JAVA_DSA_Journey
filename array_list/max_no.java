package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class max_no {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        gets(ls);
        System.out.println(max_no(ls));
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
    
    public static int max_no(ArrayList<Integer> list){
        int n = Integer.MIN_VALUE;
        for(int i = 0;i<list.size();i++){
            if(list.get(i)>n){
                n=list.get(i);
            }
        }
        return n;

    }
}
