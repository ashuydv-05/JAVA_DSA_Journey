package pattern_adv;

public class hollow_rec {
    public static void main(String args[]){
        //outer loop
        for(int i =1; i<=4;i++){
            //inner loop
            for(int j=1;j<=5;j++){
                //boundary cell.
                if(i==1||j==1||i==4||j==5){
                    System.out.print("*");
                }
                
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
