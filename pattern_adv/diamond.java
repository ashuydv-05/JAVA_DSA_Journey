package pattern_adv;

public class diamond {
    public static void main(String args[]){
        for(int i =1;i<=4;i++){
            //SPACES;
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
               // System.out.print(" space");
            }
            //stars odd number
            for(int j =1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //System.out.print("Inverted");
        //inverted
        for(int i =4;i>=1;i--){
            //SPACES;
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
               // System.out.print(" space");
            }
            //stars odd number
            for(int j =1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
