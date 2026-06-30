package recursion;

import java.util.*;

// WE print the SUBSEQUENCE
public class sub_sq {
    public static void main(String[] args) {
        String s = "abc";
        List<String> answer =  new ArrayList<>();
        subsets("", s, 0, answer);
        Collections.sort(answer);
        System.out.println(answer);
        // answer.sort

    }
    public static void subsets(String ans, String s, int idx,  List<String> ls){
        //BASE CASE
        if(idx == s.length()){
            // System.out.print(ans+" ");
            if(ans.length() != 0){
            ls.add(ans);
            }
            // System.out.println(ls);
            return;
        }
        char ch = s.charAt(idx);
        //PICK
        subsets(ans + ch, s,idx+1,ls);
        //NOT PICK
        subsets(ans , s, idx+1,ls);

    }
    
}
