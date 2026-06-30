package string;
//String Compression with String
public class compression {
    public static String str_compres(String str){
        String newStr = "";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            Integer count = 1;
            while(  i<str.length()-1 && str.charAt(i)==(str.charAt(i+1))){
                count ++;
                i++;
            }
            newStr+=ch;
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    //String compression with StringBuilder.
    public static int compress(char[] arr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = arr.length;
        // System.out.println("before append "+ arr[i]);
        // sb.append(arr[i]);
        // Integer count =1;
        while(i<n){
            // System.out.println("before append "+ arr[i]);
            sb.append(arr[i]);
            Integer count =1;
            while(i<n-1 && arr[i]==arr[i+1]){
                count++;
                // System.out.println("in while ="+count);
                i++;

            }
            if(count>1){
                // System.out.println("before append");
                sb.append(count);
            }
            i++;
        }
         String str = sb.toString();
         System.out.println(str);
        return str.length();
    }
    
    public static void main(String args[]){
        String str = "aaabbbsddd";
        char str_1[]={'a','a','a','b','b','b','b','b','b','b','b','b','b','b','b'};
        // System.out.println(str_compres(str));
        compress(str_1);
    
    }
}
