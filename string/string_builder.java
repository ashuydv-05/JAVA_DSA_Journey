package string;

public class string_builder {

    /*
     */

     public static void convert(String str){
        StringBuilder  sb = new StringBuilder();
        char ch = str.charAt(0);
        sb.append(Character.toUpperCase(ch));
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                char chh= str.charAt(i);
                sb.append(Character.toUpperCase(chh));
            }
            else  sb.append(str.charAt(i));
            //sb.append(str.charAt(i));
        }

        //converting to string back
        sb.toString();
        //printing the sb
        for(int i =0;i<sb.length();i++){
            System.out.print(sb.charAt(i));
        }
     }


    public static void main(String args[]){
        // StringBuilder sb = new StringBuilder();
        //Integer a = 100;
        //StringBuilder sa = {" "};
        //System.out.print(a.toString());
        // sb.append("ashu");
        // System.out.print(sb);
       // sb.setCharAt(0,'m');
        //System.out.print(sb);
        // sb.insert(1,'S');
        // System.out.print(sb.length());
        String str_1 = "hi, i am ashu";
        convert(str_1);



        

    }
    
}
