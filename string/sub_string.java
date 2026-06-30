package string;

public class sub_string { 
    public static String sub_string(String str, int si, int ei){
        String sub_str=" "; //empty
        for(int i =si;i<ei;i++){
            sub_str+=str.charAt(i);
        }
        return sub_str;
    }
    public static void main(String args[]){
        String str_1="Ashu Yadav";
        //System.out.println(sub_string(str_1,0,3));
        System.out.println(str_1.substring(0,3));

    }
    
}
