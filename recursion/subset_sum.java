package recursion;

import java.util.ArrayList;
import java.util.List;

public class subset_sum {
    public static void main(String args[]){
        int arr[]= {1,2,1};
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        subsetsum(arr,sum,0,ans);
        System.out.println(ans);
    }
    public static void subsetsum(int[] ar, int sum, int idx,List<Integer> ls){
        if(idx == ar.length){
            ls.add(sum);
            return;
        }
        // pick
        subsetsum(ar,sum+ar[idx],idx+1,ls);
        //not pick
        subsetsum(ar,sum,idx+1,ls);
        
        
    }
    
}
