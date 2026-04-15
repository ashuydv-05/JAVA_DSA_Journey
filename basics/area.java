//AREA OF CIRCLE
package basics;
import java.util.*;
public class area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;  // IMP
        System.out.print(area);

        sc.close();
    }
    
}
/*
if we write any decimal number in java, compiler automatically take it as double.
so inorder to make double value to float 
NEED TO ADD  'f'  AT THE END OF THE NUMBER
AS DID ABOVE
*/
