package arrays;
import java.util.*;
public class ip_op {
    public static int[] update(int marks[]){
        for(int i=0;i<=marks.length;i++){
            marks[i]=marks[i]+1;
        }

        return marks;
    }
    public static void main(String args[]){

        System.out.print("Enter 5 subject marks ");
        Scanner sc = new Scanner(System.in);
        
        int marks[] = new int[3];//ARRAY DECLARATION
    
        for(int i=0;i<=3;i++){ 
            marks[i]=sc.nextInt(); //ARRAY INPUT FOR LOOPS

        }
        marks[4]=100;
        for(int i=0;i<=5;i++){ //ARRAY OUTPUT 
            System.out.println("Marks at index" +i +"="+marks[i]);
        }
        marks[4]=100;
        System.out.print("Printing the lenght of array"+ marks.length);
        sc.close();

    }
    
}
