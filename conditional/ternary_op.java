package conditional;

public class ternary_op {
    public static void main(String args[]){
        int num = 4;
        int marks = 34;
        //ternary. operator
       // String type =((num%2)==0)?"even":"odd";
       //boolean ans =((num%2)==0)? 1:0;
       boolean ans =((num%2)==0)? true:false;
       String res=(marks>=33)?"PASS":"FAIL";
        System.out.println(ans);
        System.out.println(res);
    }
    
}
