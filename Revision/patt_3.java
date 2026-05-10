package Revision;

public class patt_3 {
    //HOLLOW RECTANGLE
    public static void hollow_rec(){
        for(int i =1;i<=3;i++){
            for(int j =1;j<=4;j++){
                if(i==1||i==3||j==1||j==4){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
    //STAR PLUS
    public static void star(){
           for(int i =1;i<=5;i++){
            for(int j =1;j<=5;j++){
                if(i==5/2+1||j==5/2+1){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    //CROSS STAR
    public static void cross(){
        for(int i=1;i<=5;i++){
            for(int j =1;j<=5;j++){
                if(i==j||j==6-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //floyds triangle
    public static void floyd(){
        int num=1;
        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    //BINARY TRIANGEL
    public static void binary(){
        
        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                int n= i+j;
                if(n%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    //ODD TRIANGLE
    public static void odd(){
        for(int i=1;i<=5;i++){
            int n=0;
            for(int j=1;j<=i;j++){
                System.out.print(j+n+" ");
                n++;
                }
                System.out.println();
            }
            
        }
    public static void main(String args[]){
        //hollow_rec();
        //star();
        //cross();
        //floyd();
        //binary();
        odd();
    }
    
}
