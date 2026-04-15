package pattern;
// observe the pattern and get idea to apply which loop

public class invert {
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j =4; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
