package Revision;
import java.util.*;
public class patt_1 {
    //PRINTING REC 
    public static void rec(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row");
        int n = sc.nextInt();
        System.out.print("Enter the number of col");
        int m = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //1234*
    public static void num(){
         for(int i =1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    //ABCD
    public static void alpha(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the num of aplha print");
        int n = sc.nextInt();
        for(int i =1;i<=4;i++){
            for(int j = 65;j<65+n;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
    //abcd
    public static void alphasmall(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the num of aplha print");
        int n = sc.nextInt();
        for(int i =1;i<=4;i++){
            for(int j = 97;j<97+n;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
    //1111 2222, 3333, 4444
    public static void nums(){
        for(int i=1;i<=4;i++){
            for(int j =1;j<=4;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    //AAAA BBBB CCCC DDDD
    public static void alpha_1(){
         for(int i=1;i<=4;i++){
            for(int j =1;j<=4;j++){
                int ch=i+64;
                System.out.print((char)ch);
            }
            System.out.println();
        }
    }
    //aaaa BBBB cccc DDDD
    public static void alpha_2(){
        for(int i =1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i%2!=0){
                    int ch=i+96;
                    System.out.print((char)ch);
                }
                else{
                    int ch = i+64;
                    System.out.print((char)ch);
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        //rec();
        //num();
        //alpha();
        //alphasmall();
        //nums();
        //alpha_1();
        alpha_2();
    }
}
