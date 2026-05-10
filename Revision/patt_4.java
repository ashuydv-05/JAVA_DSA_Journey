package Revision;

public class patt_4 {
    //RIGHT  MIRRORED INVERTED STAR
    public static void right(){
        for(int i=1;i<=4;i++){
            //space
            for(int x=4-i;x>0;x--){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //RIGHT MIRRORED  INVERTED NUMBERS
    public static void right_num(){
        for(int i=1;i<=4;i++){
            //space
            for(int x=4-i;x>0;x--){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //RHOMBUS
    public static void rhombus(){
        for(int i=1;i<=4;i++){
            //space
            for(int x=4-i;x>0;x--){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //RIGHT HORIZONTAL INVERTED TRIANGLE;
    public static void right_h(){
        for(int i=1;i<=4;i++){
            //SPACE:
            for(int x=1;x<=i-1;x++){
                System.out.print(" ");
            }
            //STARA
            for(int j =4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //PYRAMID
    public static void pyramid(){
        for(int i=1;i<=4;i++){
            //space
            for(int x =4-i;x>0;x--){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        //right();
        //right_num();
        //rhombus();
        //right_h();
        pyramid();
    }

    
}
