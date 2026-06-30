package assignment.string;
/* count lowercase vowel */
public class count_lower {
    // to count lowercase vowel
    public static int count(String str){
        int count =0;
        for(int i =0 ;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        
        System.out.println("total no. of lower case ="+ count);
        return count;
    }

    //anagram
    public static boolean anagram(String str_1 , String str_2){
        boolean ana = false;
        for(int i =0; i< str_1.length();i++){
            for(int j =0;j<str_2.length();j++){
                if(str_1.charAt(i)==str_2.charAt(j)){
                    ana = true;
                }
                else ana = false;
            }
        }
        if(ana == true) System.out.println("anagram");
        return ana;
    }
    public static void main(String args[]){
        String str_1 = "abeirwnfsosefe";
        // count(str_1);
        anagram("car","cat");

    }
    
}
