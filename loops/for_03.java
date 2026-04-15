package loops;
//PRINT REVERSE OF NUMBER
public class for_03 {
    public static void main(String args[]){
        int num= 10899;

        while(num>0){
            int ld = num%10;
            num=num/10;
            
            System.out.print(ld);
        }
    }
    
}
