package recursion;

public class generate_parenth {
    public static void main(String[] args) {
        
    }
    public static void generate( String s, int open , int close, int n){
        if((open == n) && (n == close)){
            
            return;

        }
        if( open < n){
           generate(s+"(", open+1,close,n);
        }
        if(close<open){
            s+=")";
            generate(s+")", open, close+1, n);
        }

    }
    
}
