package string;
import java.util.*;
public class basic {

    //INPUT OUPUT
    public static void in_op(){
        //INPUT
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word/ Sentence ");
        //String str = sc.next(); // Takes only the words.
        String sentence = sc.nextLine(); // takes the sentencesl
        //System.out.print(str);
        System.out.println(sentence);
        //getting the length of string, 
        System.out.println(sentence.length()); 
    }
    //CONCATENATION
    public static void concatenate(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st word ");
        String first = sc.next();
        System.out.println("Enter the 2nd word ");
        String second = sc.next();
        String full_name = first+" "+second;
        System.out.println(full_name.charAt(7));


    }
    //PRINTING
    public static void print(String str){
        for(int i= 0;i<str.length();i++){
            System.out.println(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
         //Scanner sc= new Scanner(System.in);

        //STRING DECLARATION METHODS;
         String ar = "abcd";
        // String ar_1="i";
        // System.out.println(ar_1);
        // String ar_2 = new String("ashu");

        //in_op();
        //concatenate();
        print(ar);



    }
    
}
