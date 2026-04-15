package loops;

public class break_01 {
    public static void main(String args[]){
        for(int i =0;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.print(i);
        }
        System.out.println("I AM OUT OF THE LOOP");
    }
    
}
