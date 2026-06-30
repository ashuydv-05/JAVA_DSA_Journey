package recursion;
// Power function with recursion
public class power {
    public static void main(String args[]){
        //a = BASE
        int x = 30;
        int y= 15;
        // System.out.println(pow(x,y));
        // System.out.print(Math.pow(x,y));
        // System.out.println(pow_1(x,y));
        // System.out.println(rev(12343,0));
        // System.out.println(hcf(x, y));
        System.out.println(hcf_r(x, y));



    }
    // O(b)
    public static int pow(int a, int b){
        //BASE CASE
        if(b==0) return 1;
        return a*pow(a, b-1);
    }
    //O(logb)
    public static int pow_1(int a,int b){
        //Base case
        if(b==0) return 1;
        int call = pow_1(a,b/2);
        if(b%2 == 0) return call*call;
        else return call*call*a;
    }

    //Reverse an number
    public static int rev(int n, int r){
        if(n==0) return r;
        return rev(n/10,r*10+n%10);
    }

    //HCF 
    //WITHOUT REC
    public static int hcf(int a, int b){
        
        for(int i = Math.min(a,b);i>=0;i--){
           if(a%i==0 && b%i ==0) return i;
        }
        return 1;
    }

    //WITH REC
    public static int hcf_r(int a,int b){
        if (b%a==0) return a;
        return hcf_r(b%a,a);


    }
    
}
