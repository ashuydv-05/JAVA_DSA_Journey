package basics;

public class typepromote_1 {
    public static void main(String args[]){
        char ch1 ='a';
        char ch2 = 'b';
        short c = 56;
        byte d=4;
        int b = ch1+ch2-d-c;  // int result due to type promotion
        System.out.print(b);
    }

}
