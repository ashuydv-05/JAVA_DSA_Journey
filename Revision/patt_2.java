package Revision;

public class patt_2 {
    //leftside star
    public static void left(){
        for(int i =1;i<=4;i++){
            for(int j =1;j<=i;j++){
            System.out.print("*");
            } 
            System.out.println();
        }
    }
    //A AB ABC ABCD
    public static void alpha(){
        for(int i =1;i<=4;i++){
            for(int j =1;j<=i;j++){
                int ch=j+64;
            System.out.print((char)ch);
            } 
            System.out.println();
        }
    }
    //A BB CCC DDDD
    public static void alpha_1(){
        for(int i =1;i<=4;i++){
            for(int j =1;j<=i;j++){
                int ch = i+64;
                System.out.print((char)ch);
            }
            System.out.println();
        }
    }
    //1 AB 123 ABCD 
    public static void alpha_2(){
        for(int i =1;i<=4;i++){
            for(int j =1;j<=i;j++){
                if(i%2==0){
                    int ch = j+64;
                    System.out.print((char)ch+" ");
                    
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    //HORIZONTALLY FILLIPED TRIANGEL with *
    public static void fillip(){
        for(int i =1;i<=4;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    //HORIZONTALLY FILLIPED TRIANGEL with numbers
    public static void fillip_n(){
        for(int i =1;i<=4;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    //HORIZONTALLY FILLIPED TRIANGEL with small alphabets
    public static void fillip_alph(){
        for(int i =1;i<=4;i++){
            for(int j=97;j<=101-i;j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        //left();
        // alpha();
        //alpha_1();
        //alpha_2();
        //fillip();
        //fillip_n();
        fillip_alph();
    }
}
